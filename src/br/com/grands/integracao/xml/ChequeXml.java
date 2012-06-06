package br.com.grands.integracao.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ChequeXml {

    private String cmc7;
    private String agencia;
    private String numeroConta;
    private String valorCheque;
    private String dataVencimento;
    private String codigoFebraban;
    private String cnpjComprador;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCmc7() {
        return cmc7;
    }

    public void setCmc7(String cmc7) {
        this.cmc7 = cmc7;
    }

    public String getCnpjComprador() {
        return cnpjComprador;
    }

    public void setCnpjComprador(String cnpjComprador) {
        this.cnpjComprador = cnpjComprador;
    }

    public String getCodigoFebraban() {
        return codigoFebraban;
    }

    public void setCodigoFebraban(String codigoFebraban) {
        this.codigoFebraban = codigoFebraban;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(String valorCheque) {
        this.valorCheque = valorCheque;
    }    
}
