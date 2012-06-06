package br.com.grands.integracao.xml;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VendaXml {

    private String cnpjLoja;
    private String numeroDaVenda;
    private String dataVenda;
    private String valorVenda;
    private String numeroCartao;
    private List<ChequeXml> chequeXmlList;
    private List<PagamentoXml> pagamentoXmlList;

    public String getCnpjLoja() {
        return cnpjLoja;
    }

    public void setCnpjLoja(String cnpjLoja) {
        this.cnpjLoja = cnpjLoja;
    }

    public String getNumeroDaVenda() {
        return numeroDaVenda;
    }

    public void setNumeroDaVenda(String numeroDaVenda) {
        this.numeroDaVenda = numeroDaVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public List<ChequeXml> getChequeXmlList() {
        return chequeXmlList;
    }

    public void setChequeXmlList(List<ChequeXml> chequeXmlList) {
        this.chequeXmlList = chequeXmlList;
    }

    public List<PagamentoXml> getPagamentoXmlList() {
        return pagamentoXmlList;
    }

    public void setPagamentoXmlList(List<PagamentoXml> pagamentoXmlList) {
        this.pagamentoXmlList = pagamentoXmlList;
    }
}
