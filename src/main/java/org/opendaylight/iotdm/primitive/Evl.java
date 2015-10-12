//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.24 at 05:38:13 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="lgt" type="{http://www.onem2m.org/xml/protocols}logTypeId"/>
 *         &lt;element name="lgd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lgst" type="{http://www.onem2m.org/xml/protocols}logStatus"/>
 *         &lt;element name="lga" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lgo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ch" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}sub" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lgt",
    "lgd",
    "lgst",
    "lga",
    "lgo",
    "ch",
    "sub"
})
@XmlRootElement(name = "evl")
public class Evl
    extends MgmtResource
{

    @XmlElement(required = true)
    protected BigInteger lgt;
    @XmlElement(required = true)
    protected String lgd;
    @XmlElement(required = true)
    protected BigInteger lgst;
    protected boolean lga;
    protected boolean lgo;
    protected List<ChildResourceRef> ch;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Sub> sub;

    /**
     * Gets the value of the lgt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLgt() {
        return lgt;
    }

    /**
     * Sets the value of the lgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLgt(BigInteger value) {
        this.lgt = value;
    }

    /**
     * Gets the value of the lgd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgd() {
        return lgd;
    }

    /**
     * Sets the value of the lgd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgd(String value) {
        this.lgd = value;
    }

    /**
     * Gets the value of the lgst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLgst() {
        return lgst;
    }

    /**
     * Sets the value of the lgst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLgst(BigInteger value) {
        this.lgst = value;
    }

    /**
     * Gets the value of the lga property.
     * 
     */
    public boolean isLga() {
        return lga;
    }

    /**
     * Sets the value of the lga property.
     * 
     */
    public void setLga(boolean value) {
        this.lga = value;
    }

    /**
     * Gets the value of the lgo property.
     * 
     */
    public boolean isLgo() {
        return lgo;
    }

    /**
     * Sets the value of the lgo property.
     * 
     */
    public void setLgo(boolean value) {
        this.lgo = value;
    }

    /**
     * Gets the value of the ch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getCh() {
        if (ch == null) {
            ch = new ArrayList<ChildResourceRef>();
        }
        return this.ch;
    }

    /**
     * Gets the value of the sub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sub }
     * 
     * 
     */
    public List<Sub> getSub() {
        if (sub == null) {
            sub = new ArrayList<Sub>();
        }
        return this.sub;
    }

}
