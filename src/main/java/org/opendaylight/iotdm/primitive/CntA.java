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
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedResource">
 *       &lt;sequence>
 *         &lt;element name="st" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="mni" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="mbs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="mia" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cni" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cbs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="li" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="or" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ch" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}cin"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}cinA"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}cnt"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}cntA"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}sub"/>
 *           &lt;/choice>
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
    "st",
    "mni",
    "mbs",
    "mia",
    "cni",
    "cbs",
    "li",
    "or",
    "ch",
    "cinOrCinAOrCnt"
})
@XmlRootElement(name = "cntA")
public class CntA
    extends AnnouncedResource
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger st;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mni;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mbs;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mia;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cni;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cbs;
    @XmlSchemaType(name = "anyURI")
    protected String li;
    @XmlSchemaType(name = "anyURI")
    protected String or;
    protected List<ChildResourceRef> ch;
    @XmlElements({
        @XmlElement(name = "cin", namespace = "http://www.onem2m.org/xml/protocols", type = Cin.class),
        @XmlElement(name = "cinA", namespace = "http://www.onem2m.org/xml/protocols", type = CinA.class),
        @XmlElement(name = "cnt", namespace = "http://www.onem2m.org/xml/protocols", type = Cnt.class),
        @XmlElement(name = "cntA", namespace = "http://www.onem2m.org/xml/protocols", type = CntA.class),
        @XmlElement(name = "sub", namespace = "http://www.onem2m.org/xml/protocols", type = Sub.class)
    })
    protected List<Resource> cinOrCinAOrCnt;

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
     * Gets the value of the mni property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMni() {
        return mni;
    }

    /**
     * Sets the value of the mni property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMni(BigInteger value) {
        this.mni = value;
    }

    /**
     * Gets the value of the mbs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMbs() {
        return mbs;
    }

    /**
     * Sets the value of the mbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMbs(BigInteger value) {
        this.mbs = value;
    }

    /**
     * Gets the value of the mia property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMia() {
        return mia;
    }

    /**
     * Sets the value of the mia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMia(BigInteger value) {
        this.mia = value;
    }

    /**
     * Gets the value of the cni property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCni() {
        return cni;
    }

    /**
     * Sets the value of the cni property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCni(BigInteger value) {
        this.cni = value;
    }

    /**
     * Gets the value of the cbs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCbs() {
        return cbs;
    }

    /**
     * Sets the value of the cbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCbs(BigInteger value) {
        this.cbs = value;
    }

    /**
     * Gets the value of the li property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLi() {
        return li;
    }

    /**
     * Sets the value of the li property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLi(String value) {
        this.li = value;
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
     * Gets the value of the cinOrCinAOrCnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cinOrCinAOrCnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCinOrCinAOrCnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cin }
     * {@link CinA }
     * {@link Cnt }
     * {@link CntA }
     * {@link Sub }
     * 
     * 
     */
    public List<Resource> getCinOrCinAOrCnt() {
        if (cinOrCinAOrCnt == null) {
            cinOrCinAOrCnt = new ArrayList<Resource>();
        }
        return this.cinOrCinAOrCnt;
    }

}
