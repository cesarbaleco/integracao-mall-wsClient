package br.com.grands.integracao.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ContaBancariaXml {
    
    private String cpfCnpj;
    private String numeroConta;
    private String codigoFebraban;
    private String agencia;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCodigoFebraban() {
        return codigoFebraban;
    }

    public void setCodigoFebraban(String codigoFebraban) {
        this.codigoFebraban = codigoFebraban;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
