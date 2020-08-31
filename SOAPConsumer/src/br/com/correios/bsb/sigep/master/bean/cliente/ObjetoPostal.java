
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de objetoPostal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="objetoPostal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEtiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAtualizacaoCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataBloqueioObjeto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCancelamentoEtiqueta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="objetoPostalPK" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objetoPostalPK" minOccurs="0"/>
 *         &lt;element name="plpNu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preListaPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}preListaPostagem" minOccurs="0"/>
 *         &lt;element name="restricaoAerea" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}simNao" minOccurs="0"/>
 *         &lt;element name="statusBloqueio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusEtiqueta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusObjetoPostal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoPostal", propOrder = {
    "codigoEtiqueta",
    "dataAtualizacaoCliente",
    "dataBloqueioObjeto",
    "dataCancelamentoEtiqueta",
    "dataInclusao",
    "objetoPostalPK",
    "plpNu",
    "preListaPostagem",
    "restricaoAerea",
    "statusBloqueio",
    "statusEtiqueta"
})
public class ObjetoPostal {

    protected String codigoEtiqueta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacaoCliente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataBloqueioObjeto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelamentoEtiqueta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInclusao;
    protected ObjetoPostalPK objetoPostalPK;
    protected Long plpNu;
    protected PreListaPostagem preListaPostagem;
    @XmlSchemaType(name = "string")
    protected SimNao restricaoAerea;
    protected String statusBloqueio;
    @XmlSchemaType(name = "string")
    protected StatusObjetoPostal statusEtiqueta;

    /**
     * Obt�m o valor da propriedade codigoEtiqueta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }

    /**
     * Define o valor da propriedade codigoEtiqueta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEtiqueta(String value) {
        this.codigoEtiqueta = value;
    }

    /**
     * Obt�m o valor da propriedade dataAtualizacaoCliente.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacaoCliente() {
        return dataAtualizacaoCliente;
    }

    /**
     * Define o valor da propriedade dataAtualizacaoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacaoCliente(XMLGregorianCalendar value) {
        this.dataAtualizacaoCliente = value;
    }

    /**
     * Obt�m o valor da propriedade dataBloqueioObjeto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataBloqueioObjeto() {
        return dataBloqueioObjeto;
    }

    /**
     * Define o valor da propriedade dataBloqueioObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataBloqueioObjeto(XMLGregorianCalendar value) {
        this.dataBloqueioObjeto = value;
    }

    /**
     * Obt�m o valor da propriedade dataCancelamentoEtiqueta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelamentoEtiqueta() {
        return dataCancelamentoEtiqueta;
    }

    /**
     * Define o valor da propriedade dataCancelamentoEtiqueta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelamentoEtiqueta(XMLGregorianCalendar value) {
        this.dataCancelamentoEtiqueta = value;
    }

    /**
     * Obt�m o valor da propriedade dataInclusao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInclusao() {
        return dataInclusao;
    }

    /**
     * Define o valor da propriedade dataInclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInclusao(XMLGregorianCalendar value) {
        this.dataInclusao = value;
    }

    /**
     * Obt�m o valor da propriedade objetoPostalPK.
     * 
     * @return
     *     possible object is
     *     {@link ObjetoPostalPK }
     *     
     */
    public ObjetoPostalPK getObjetoPostalPK() {
        return objetoPostalPK;
    }

    /**
     * Define o valor da propriedade objetoPostalPK.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjetoPostalPK }
     *     
     */
    public void setObjetoPostalPK(ObjetoPostalPK value) {
        this.objetoPostalPK = value;
    }

    /**
     * Obt�m o valor da propriedade plpNu.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlpNu() {
        return plpNu;
    }

    /**
     * Define o valor da propriedade plpNu.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlpNu(Long value) {
        this.plpNu = value;
    }

    /**
     * Obt�m o valor da propriedade preListaPostagem.
     * 
     * @return
     *     possible object is
     *     {@link PreListaPostagem }
     *     
     */
    public PreListaPostagem getPreListaPostagem() {
        return preListaPostagem;
    }

    /**
     * Define o valor da propriedade preListaPostagem.
     * 
     * @param value
     *     allowed object is
     *     {@link PreListaPostagem }
     *     
     */
    public void setPreListaPostagem(PreListaPostagem value) {
        this.preListaPostagem = value;
    }

    /**
     * Obt�m o valor da propriedade restricaoAerea.
     * 
     * @return
     *     possible object is
     *     {@link SimNao }
     *     
     */
    public SimNao getRestricaoAerea() {
        return restricaoAerea;
    }

    /**
     * Define o valor da propriedade restricaoAerea.
     * 
     * @param value
     *     allowed object is
     *     {@link SimNao }
     *     
     */
    public void setRestricaoAerea(SimNao value) {
        this.restricaoAerea = value;
    }

    /**
     * Obt�m o valor da propriedade statusBloqueio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusBloqueio() {
        return statusBloqueio;
    }

    /**
     * Define o valor da propriedade statusBloqueio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBloqueio(String value) {
        this.statusBloqueio = value;
    }

    /**
     * Obt�m o valor da propriedade statusEtiqueta.
     * 
     * @return
     *     possible object is
     *     {@link StatusObjetoPostal }
     *     
     */
    public StatusObjetoPostal getStatusEtiqueta() {
        return statusEtiqueta;
    }

    /**
     * Define o valor da propriedade statusEtiqueta.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusObjetoPostal }
     *     
     */
    public void setStatusEtiqueta(StatusObjetoPostal value) {
        this.statusEtiqueta = value;
    }

}
