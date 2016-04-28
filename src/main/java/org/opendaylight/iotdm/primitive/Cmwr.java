//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.26 at 12:59:59 PM EDT 
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
 *         &lt;element name="ttn" type="{http://www.onem2m.org/xml/protocols}listOfM2MID"/>
 *         &lt;element name="mrv" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="bop" type="{http://www.onem2m.org/xml/protocols}backOffParameters"/>
 *         &lt;element name="ohc" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="cmlk" type="{http://www.onem2m.org/xml/protocols}mgmtLinkRef"/>
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
    "ttn",
    "mrv",
    "bop",
    "ohc",
    "cmlk"
})
@XmlRootElement(name = "cmwr")
public class Cmwr
    extends MgmtResource
{

    @XmlList
    @XmlElement(required = true)
    protected List<String> ttn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mrv;
    @XmlList
    @XmlElement(required = true)
    protected List<BigInteger> bop;
    @XmlElement(required = true)
    protected Object ohc;
    @XmlElement(required = true)
    protected MgmtLinkRef cmlk;

    /**
     * Gets the value of the ttn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTtn() {
        if (ttn == null) {
            ttn = new ArrayList<String>();
        }
        return this.ttn;
    }

    /**
     * Gets the value of the mrv property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMrv() {
        return mrv;
    }

    /**
     * Sets the value of the mrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMrv(BigInteger value) {
        this.mrv = value;
    }

    /**
     * Gets the value of the bop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getBop() {
        if (bop == null) {
            bop = new ArrayList<BigInteger>();
        }
        return this.bop;
    }

    /**
     * Gets the value of the ohc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOhc() {
        return ohc;
    }

    /**
     * Sets the value of the ohc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOhc(Object value) {
        this.ohc = value;
    }

    /**
     * Gets the value of the cmlk property.
     * 
     * @return
     *     possible object is
     *     {@link MgmtLinkRef }
     *     
     */
    public MgmtLinkRef getCmlk() {
        return cmlk;
    }

    /**
     * Sets the value of the cmlk property.
     * 
     * @param value
     *     allowed object is
     *     {@link MgmtLinkRef }
     *     
     */
    public void setCmlk(MgmtLinkRef value) {
        this.cmlk = value;
    }

}
