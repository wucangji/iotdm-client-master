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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mgmtResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mgmtResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="mgd" type="{http://www.onem2m.org/xml/protocols}mgmtDefinition"/>
 *         &lt;element name="obis" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="obps" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="dc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mgmtResource", propOrder = {
    "mgd",
    "obis",
    "obps",
    "dc"
})
@XmlSeeAlso({
    Cmwr.class,
    Cmpv.class,
    Cmdv.class,
    Cml.class,
    Acmp.class,
    Cmp.class,
    Evl.class,
    Andi.class,
    Ani.class,
    Mem.class,
    Cmdf.class,
    Fwr.class,
    Rbo.class,
    Dvi.class,
    Bat.class,
    Dvc.class,
    Swr.class,
    Cmnr.class,
    Cmbf.class
})
public class MgmtResource
    extends AnnounceableResource
{

    @XmlElement(required = true)
    protected BigInteger mgd;
    @XmlList
    protected List<String> obis;
    @XmlList
    protected List<String> obps;
    protected String dc;

    /**
     * Gets the value of the mgd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMgd() {
        return mgd;
    }

    /**
     * Sets the value of the mgd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMgd(BigInteger value) {
        this.mgd = value;
    }

    /**
     * Gets the value of the obis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObis() {
        if (obis == null) {
            obis = new ArrayList<String>();
        }
        return this.obis;
    }

    /**
     * Gets the value of the obps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObps() {
        if (obps == null) {
            obps = new ArrayList<String>();
        }
        return this.obps;
    }

    /**
     * Gets the value of the dc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDc() {
        return dc;
    }

    /**
     * Sets the value of the dc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDc(String value) {
        this.dc = value;
    }

}
