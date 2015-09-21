//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 01:22:00 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for metaInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metaInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ty" type="{http://www.onem2m.org/xml/protocols}resourceType" minOccurs="0"/>
 *         &lt;element name="nm" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="ot" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="rqet" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp" minOccurs="0"/>
 *         &lt;element name="rset" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp" minOccurs="0"/>
 *         &lt;element name="oet" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp" minOccurs="0"/>
 *         &lt;element name="rt" type="{http://www.onem2m.org/xml/protocols}responseTypeInfo" minOccurs="0"/>
 *         &lt;element name="rp" type="{http://www.onem2m.org/xml/protocols}absRelTimestamp" minOccurs="0"/>
 *         &lt;element name="rcn" type="{http://www.onem2m.org/xml/protocols}resultContent" minOccurs="0"/>
 *         &lt;element name="ec" type="{http://www.onem2m.org/xml/protocols}eventCat" minOccurs="0"/>
 *         &lt;element name="da" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fc" type="{http://www.onem2m.org/xml/protocols}filterCriteria" minOccurs="0"/>
 *         &lt;element name="drt" type="{http://www.onem2m.org/xml/protocols}discResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaInformation", propOrder = {
    "ty",
    "nm",
    "ot",
    "rqet",
    "rset",
    "oet",
    "rt",
    "rp",
    "rcn",
    "ec",
    "da",
    "gid",
    "fc",
    "drt"
})
public class MetaInformation {

    protected BigInteger ty;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String nm;
    protected String ot;
    protected String rqet;
    protected String rset;
    protected String oet;
    protected ResponseTypeInfo rt;
    protected String rp;
    protected BigInteger rcn;
    protected String ec;
    protected Boolean da;
    protected String gid;
    protected FilterCriteria fc;
    protected BigInteger drt;

    /**
     * Gets the value of the ty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTy() {
        return ty;
    }

    /**
     * Sets the value of the ty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTy(BigInteger value) {
        this.ty = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the ot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOt() {
        return ot;
    }

    /**
     * Sets the value of the ot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOt(String value) {
        this.ot = value;
    }

    /**
     * Gets the value of the rqet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqet() {
        return rqet;
    }

    /**
     * Sets the value of the rqet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqet(String value) {
        this.rqet = value;
    }

    /**
     * Gets the value of the rset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRset() {
        return rset;
    }

    /**
     * Sets the value of the rset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRset(String value) {
        this.rset = value;
    }

    /**
     * Gets the value of the oet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOet() {
        return oet;
    }

    /**
     * Sets the value of the oet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOet(String value) {
        this.oet = value;
    }

    /**
     * Gets the value of the rt property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTypeInfo }
     *     
     */
    public ResponseTypeInfo getRt() {
        return rt;
    }

    /**
     * Sets the value of the rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTypeInfo }
     *     
     */
    public void setRt(ResponseTypeInfo value) {
        this.rt = value;
    }

    /**
     * Gets the value of the rp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRp() {
        return rp;
    }

    /**
     * Sets the value of the rp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRp(String value) {
        this.rp = value;
    }

    /**
     * Gets the value of the rcn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRcn() {
        return rcn;
    }

    /**
     * Sets the value of the rcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRcn(BigInteger value) {
        this.rcn = value;
    }

    /**
     * Gets the value of the ec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEc() {
        return ec;
    }

    /**
     * Sets the value of the ec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEc(String value) {
        this.ec = value;
    }

    /**
     * Gets the value of the da property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDa() {
        return da;
    }

    /**
     * Sets the value of the da property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDa(Boolean value) {
        this.da = value;
    }

    /**
     * Gets the value of the gid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGid(String value) {
        this.gid = value;
    }

    /**
     * Gets the value of the fc property.
     * 
     * @return
     *     possible object is
     *     {@link FilterCriteria }
     *     
     */
    public FilterCriteria getFc() {
        return fc;
    }

    /**
     * Sets the value of the fc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCriteria }
     *     
     */
    public void setFc(FilterCriteria value) {
        this.fc = value;
    }

    /**
     * Gets the value of the drt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrt() {
        return drt;
    }

    /**
     * Sets the value of the drt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrt(BigInteger value) {
        this.drt = value;
    }

}
