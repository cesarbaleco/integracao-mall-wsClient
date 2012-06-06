package br.com.grands.integracao;

import br.com.grands.integracao.xml.PagamentoXml;
import br.com.grands.integracao.xml.VendaXml;
import java.util.ArrayList;
import java.util.List;

public class TesteIntegracao {
  
    
    public static void main(String[] args) {
        testeVenda();
        testeValidaCartao();
        testeValidaCredito();
        testeValidaConta();
        
    }
    
     public static void testeVenda(){
        VendaXml vendaXml = new VendaXml();
        vendaXml.setPagamentoXmlList(populateListPagamentoXml());
        vendaXml.setCnpjLoja("53867959000195");
        vendaXml.setDataVenda("01/07/2012 01:00:00");
        vendaXml.setNumeroCartao("1");
        vendaXml.setNumeroDaVenda("");
        vendaXml.setValorVenda("100.00");
        String x = ClientIntegracao.consumoVenda(vendaXml);
        System.out.println(x+"1"); 
    }
     
       public static void testeValidaCartao(){
        String codigo = "1";
        String x = ClientIntegracao.validaCartao(codigo);
        codigo = "2";
        String y = ClientIntegracao.validaCartao(codigo);
        System.out.println(x+"2"); 
        System.out.println(y+"3"); 
    }
    
    public static void testeValidaCredito(){
        String codigo = "1";
        String x = ClientIntegracao.validaCreditoDisponivel(codigo);
        codigo = "2";
        String y = ClientIntegracao.validaCreditoDisponivel(codigo);
        System.out.println(x+"4"); 
        System.out.println(y+"5"); 
    }
    
    public static void testeValidaConta(){
        String x = ClientIntegracao.validaContaBancaria("001", "1234", "123456", "12345678901230");
        System.out.println(x+"6"); 
        
        String y = ClientIntegracao.validaContaBancaria("001", "1111", "111111", "12345678901230");
        System.out.println(y+"7"); 
    }
    
    private static List<PagamentoXml> populateListPagamentoXml() {
        List<PagamentoXml> list = new ArrayList<PagamentoXml>();
        PagamentoXml pagamentoXml = new PagamentoXml();
        pagamentoXml.setComissaoFormaPagamento("cheque");
        pagamentoXml.setValor("100.00");
        pagamentoXml.setAgencia("1234");
        pagamentoXml.setCmc7("");
        pagamentoXml.setCodigoFebraban("001");
        pagamentoXml.setDataVencimento("01/07/2012 01:00:00");
        pagamentoXml.setNumeroCheque("123");
        pagamentoXml.setNumeroConta("123456");
        pagamentoXml.setTipoComissaoPagamento("CHEQUE");
        pagamentoXml.setValorCheque("100.00");
        list.add(pagamentoXml);
        return list;
    }

}
