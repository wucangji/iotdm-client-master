//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 02:34:26 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="od" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="dev" type="{http://www.onem2m.org/xml/protocols}eventCat"/>
 *         &lt;element name="ror" type="{http://www.onem2m.org/xml/protocols}listOfM2MID"/>
 *         &lt;element name="rct" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="rctn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rch" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "od",
    "dev",
    "ror",
    "rct",
    "rctn",
    "rch"
})
@XmlRootElement(name = "cmdv")
public class Cmdv
    extends MgmtResource
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger od;
    @XmlElement(required = true)
    protected String dev;
    @XmlList
    @XmlElement(required = true)
    protected List<String> ror;
    protected Object rct;
    protected Boolean rctn;
    protected Object rch;

    /**
     * Gets the value of the od property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOd() {
        return od;
    }

    /**
     * Sets the value of the od property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOd(BigInteger value) {
        this.od = value;
    }

    /**
     * Gets the value of the dev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDev() {
        return dev;
    }

    /**
     * Sets the value of the dev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDev(String value) {
        this.dev = value;
    }

    /**
     * Gets the value of the ror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRor() {
        if (ror == null) {
            ror = new ArrayList<String>();
        }
        return this.ror;
    }

    /**
     * Gets the value of the rct property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRct() {
        return rct;
    }

    /**
     * Sets the value of the rct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRct(Object value) {
        this.rct = value;
    }

    /**
     * Gets the value of the rctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctn() {
        return rctn;
    }

    /**
     * Sets the value of the rctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRctn(Boolean value) {
        this.rctn = value;
    }

    /**
     * Gets the value of the rch property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRch() {
        return rch;
    }

    /**
     * Sets the value of the rch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRch(Object value) {
        this.rch = value;
    }

}
