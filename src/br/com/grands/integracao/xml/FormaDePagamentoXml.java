package br.com.grands.integracao.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="formaPagamento")
public class FormaDePagamentoXml {
    private String descricao;
    private String tipo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
