//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.19 at 11:59:33 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadArgsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadArgsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ftyp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="unm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fsi" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="tgf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dss" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="surl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="stt" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *         &lt;element name="cpt" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *         &lt;element name="any" type="{http://www.onem2m.org/xml/protocols}anyArgType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadArgsType", propOrder = {
    "ftyp",
    "url",
    "unm",
    "pwd",
    "fsi",
    "tgf",
    "dss",
    "surl",
    "stt",
    "cpt",
    "any"
})
public class DownloadArgsType {

    @XmlElement(required = true)
    protected String ftyp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(required = true)
    protected String unm;
    @XmlElement(required = true)
    protected String pwd;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fsi;
    @XmlElement(required = true)
    protected String tgf;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dss;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String surl;
    @XmlElement(required = true)
    protected String stt;
    @XmlElement(required = true)
    protected String cpt;
    protected List<AnyArgType> any;

    /**
     * Gets the value of the ftyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtyp() {
        return ftyp;
    }

    /**
     * Sets the value of the ftyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtyp(String value) {
        this.ftyp = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the unm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnm() {
        return unm;
    }

    /**
     * Sets the value of the unm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnm(String value) {
        this.unm = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * Gets the value of the fsi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFsi() {
        return fsi;
    }

    /**
     * Sets the value of the fsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFsi(BigInteger value) {
        this.fsi = value;
    }

    /**
     * Gets the value of the tgf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTgf() {
        return tgf;
    }

    /**
     * Sets the value of the tgf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTgf(String value) {
        this.tgf = value;
    }

    /**
     * Gets the value of the dss property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDss() {
        return dss;
    }

    /**
     * Sets the value of the dss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDss(BigInteger value) {
        this.dss = value;
    }

    /**
     * Gets the value of the surl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurl() {
        return surl;
    }

    /**
     * Sets the value of the surl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurl(String value) {
        this.surl = value;
    }

    /**
     * Gets the value of the stt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStt() {
        return stt;
    }

    /**
     * Sets the value of the stt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStt(String value) {
        this.stt = value;
    }

    /**
     * Gets the value of the cpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpt() {
        return cpt;
    }

    /**
     * Sets the value of the cpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpt(String value) {
        this.cpt = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyArgType }
     * 
     * 
     */
    public List<AnyArgType> getAny() {
        if (any == null) {
            any = new ArrayList<AnyArgType>();
        }
        return this.any;
    }

}
