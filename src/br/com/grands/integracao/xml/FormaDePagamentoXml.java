package br.com.grands.integracao.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="formaPagamento")
public class FormaDePagamentoXml {
   
    @XmlElements({
        @XmlElement(name = "descricao", type = Descricao.class),
        @XmlElement(name = "tipo", type = Tipo.class)
    })
    public List<Descricao> descricaoList = new ArrayList();
    
    public List<Tipo> tipoList = new ArrayList();
    
    private String valorMaximoCheque;

    public String getValorMaximoCheque() {
        return valorMaximoCheque;
    }

    public void setValorMaximoCheque(String valorMaximoCheque) {
        this.valorMaximoCheque = valorMaximoCheque;
    }
    
}
