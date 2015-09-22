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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedResource">
 *       &lt;sequence>
 *         &lt;element name="los" type="{http://www.onem2m.org/xml/protocols}locationSource" minOccurs="0"/>
 *         &lt;element name="lou" type="{http://www.onem2m.org/xml/protocols}listOfDuration" minOccurs="0"/>
 *         &lt;element name="lot" type="{http://www.onem2m.org/xml/protocols}nodeID" minOccurs="0"/>
 *         &lt;element name="lor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="loi" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "los",
    "lou",
    "lot",
    "lor",
    "loi",
    "lon",
    "lost"
})
@XmlRootElement(name = "lcpA")
public class LcpA
    extends AnnouncedResource
{

    protected BigInteger los;
    @XmlList
    protected List<Duration> lou;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lot;
    @XmlSchemaType(name = "anyURI")
    protected String lor;
    @XmlSchemaType(name = "anyURI")
    protected String loi;
    protected String lon;
    protected String lost;

    /**
     * Gets the value of the los property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLos() {
        return los;
    }

    /**
     * Sets the value of the los property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLos(BigInteger value) {
        this.los = value;
    }

    /**
     * Gets the value of the lou property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lou property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLou().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Duration }
     * 
     * 
     */
    public List<Duration> getLou() {
        if (lou == null) {
            lou = new ArrayList<Duration>();
        }
        return this.lou;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLot(String value) {
        this.lot = value;
    }

    /**
     * Gets the value of the lor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLor() {
        return lor;
    }

    /**
     * Sets the value of the lor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLor(String value) {
        this.lor = value;
    }

    /**
     * Gets the value of the loi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoi() {
        return loi;
    }

    /**
     * Sets the value of the loi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoi(String value) {
        this.loi = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLon(String value) {
        this.lon = value;
    }

    /**
     * Gets the value of the lost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLost() {
        return lost;
    }

    /**
     * Sets the value of the lost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLost(String value) {
        this.lost = value;
    }

}
