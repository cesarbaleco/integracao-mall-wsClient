package br.com.grands.integracao;

import br.com.grands.integracao.xml.VendaXml;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.text.MessageFormat;
import javax.ws.rs.core.MediaType;

public class ClientIntegracao {

    private static Client client;
    private static String BASE_URI = "http://localhost:8080/mall-ws-integracao/ws";

    public static String validaContaBancaria(String codigoFebraban, String agencia, String numeroConta, String cnpj) throws UniformInterfaceException {
        WebResource resource = config();

        String mensagem;
        resource = resource.path(java.text.MessageFormat.format("conta/{0}/{1}/{2}/{3}", new Object[]{codigoFebraban, agencia, numeroConta, cnpj}));
        mensagem = resource.get(String.class);
        if (mensagem.equals("true")) {
            mensagem = "Conta bancária aprovada.";
        } else {
            mensagem = "Conta bancária não cadastrada para este comprador.";
        }
        return mensagem;
    }

    public static String consumoVenda(VendaXml requestEntity) {
        WebResource resource = config();
        String mensagem;
        try {
            if (resource.path("venda").type(MediaType.APPLICATION_XML).put(String.class, requestEntity).equals("true")) {
                mensagem = "Problemas ao enviar a venda. 'Número da venda já cadastrado'. ";
            } else if (resource.path("venda").type(MediaType.APPLICATION_XML).put(String.class, requestEntity).equals("false")) {
                mensagem = "Venda enviada com sucesso.";
            } else {
                mensagem = resource.path("venda").type(MediaType.APPLICATION_XML).put(String.class, requestEntity);
            }
        } catch (UniformInterfaceException e) {
            e.printStackTrace();
            mensagem = "Problemas ao enviar a venda.";
        }
        return mensagem;
    }

    public static String validaCreditoDisponivel(String numeroCartao) throws UniformInterfaceException {
        WebResource resource = config();

        String mensagem;
        resource = resource.path(MessageFormat.format("credito/{0}", new Object[]{numeroCartao}));
        try {
            if (resource.accept(MediaType.APPLICATION_XML).get(String.class).equals("true")) {
                mensagem = "Este cartão não possui crédito disponível.";
            } else {
                mensagem = "Crédito aprovado.";
            }
        } catch (UniformInterfaceException e) {
            e.printStackTrace();
            mensagem = "Problemas ao validar o crédito.";
        }
        return mensagem;
    }

    public static String validaCartao(String numeroCartao) throws UniformInterfaceException {
        WebResource resource = config();
        String mensagem;
        resource = resource.path(MessageFormat.format("cartao/{0}", new Object[]{numeroCartao}));
        try {
            if (resource.accept(MediaType.APPLICATION_XML).get(String.class).equals("true")) {
                mensagem = "Cartão válido.";
            } else {
                mensagem = resource.accept(MediaType.APPLICATION_XML).get(String.class);
            }
        } catch (UniformInterfaceException e) {
            e.printStackTrace();
            mensagem = "Problemas ao validar o crédito.";
        }
        return mensagem;
    }

    public static void close() {
        client.destroy();
    }

    private static WebResource config() {
        ClientConfig config = new DefaultClientConfig();
        client = Client.create(config);

        return client.resource(BASE_URI).path("integracao");
    }
}
