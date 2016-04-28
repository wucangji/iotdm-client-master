//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.26 at 12:59:59 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedSubordinateResource">
 *       &lt;sequence>
 *         &lt;element name="st" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="cnf" type="{http://www.onem2m.org/xml/protocols}contentInfo" minOccurs="0"/>
 *         &lt;element name="cs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="or" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="con" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "st",
    "cnf",
    "cs",
    "or",
    "con"
})
@XmlRootElement(name = "cinA")
public class CinA
    extends AnnouncedSubordinateResource
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger st;
    protected String cnf;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cs;
    @XmlSchemaType(name = "anyURI")
    protected String or;
    protected Object con;

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSt() {
        return st;
    }

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSt(BigInteger value) {
        this.st = value;
    }

    /**
     * Gets the value of the cnf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnf() {
        return cnf;
    }

    /**
     * Sets the value of the cnf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnf(String value) {
        this.cnf = value;
    }

    /**
     * Gets the value of the cs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCs() {
        return cs;
    }

    /**
     * Sets the value of the cs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCs(BigInteger value) {
        this.cs = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOr(String value) {
        this.or = value;
    }

    /**
     * Gets the value of the con property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCon() {
        return con;
    }

    /**
     * Sets the value of the con property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCon(Object value) {
        this.con = value;
    }

}
