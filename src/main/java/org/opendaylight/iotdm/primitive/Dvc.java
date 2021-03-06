//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.26 at 12:59:59 PM EDT 
//


package org.opendaylight.iotdm.primitive;

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
 *         &lt;element name="can" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="att" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cas" type="{http://www.onem2m.org/xml/protocols}actionStatus"/>
 *         &lt;element name="cus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ena" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "can",
    "att",
    "cas",
    "cus",
    "ena",
    "dis",
    "ch",
    "sub"
})
@XmlRootElement(name = "dvc")
public class Dvc
    extends MgmtResource
{

    @XmlElement(required = true)
    protected String can;
    protected boolean att;
    @XmlElement(required = true)
    protected ActionStatus cas;
    protected boolean cus;
    protected Boolean ena;
    protected Boolean dis;
    protected List<ChildResourceRef> ch;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Sub> sub;

    /**
     * Gets the value of the can property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCan() {
        return can;
    }

    /**
     * Sets the value of the can property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCan(String value) {
        this.can = value;
    }

    /**
     * Gets the value of the att property.
     * 
     */
    public boolean isAtt() {
        return att;
    }

    /**
     * Sets the value of the att property.
     * 
     */
    public void setAtt(boolean value) {
        this.att = value;
    }

    /**
     * Gets the value of the cas property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getCas() {
        return cas;
    }

    /**
     * Sets the value of the cas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setCas(ActionStatus value) {
        this.cas = value;
    }

    /**
     * Gets the value of the cus property.
     * 
     */
    public boolean isCus() {
        return cus;
    }

    /**
     * Sets the value of the cus property.
     * 
     */
    public void setCus(boolean value) {
        this.cus = value;
    }

    /**
     * Gets the value of the ena property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEna() {
        return ena;
    }

    /**
     * Sets the value of the ena property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEna(Boolean value) {
        this.ena = value;
    }

    /**
     * Gets the value of the dis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDis() {
        return dis;
    }

    /**
     * Sets the value of the dis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDis(Boolean value) {
        this.dis = value;
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
