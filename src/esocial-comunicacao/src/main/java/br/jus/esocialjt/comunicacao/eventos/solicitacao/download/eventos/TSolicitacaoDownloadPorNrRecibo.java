//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.30 at 04:37:50 PM BRST 
//


package br.jus.esocialjt.comunicacao.eventos.solicitacao.download.eventos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Define os par\u00e2metros para consulta por n\u00famero de recibo do evento.
 * 
 * <p>Java class for TSolicitacaoDownloadPorNrRecibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSolicitacaoDownloadPorNrRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrRec" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSolicitacaoDownloadPorNrRecibo", namespace = "http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0", propOrder = {
    "nrRec"
})
public class TSolicitacaoDownloadPorNrRecibo {

    @XmlElement(required = true)
    protected List<String> nrRec;

    /**
     * Gets the value of the nrRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nrRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNrRec() {
        if (nrRec == null) {
            nrRec = new ArrayList<String>();
        }
        return this.nrRec;
    }

}