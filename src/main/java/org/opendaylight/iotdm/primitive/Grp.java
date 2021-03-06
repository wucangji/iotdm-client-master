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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="cr" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="mt" type="{http://www.onem2m.org/xml/protocols}memberType"/>
 *         &lt;element name="cnm" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="mnm" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="mid" type="{http://www.onem2m.org/xml/protocols}listOfURIs"/>
 *         &lt;element name="macp" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="mtv" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="csy" type="{http://www.onem2m.org/xml/protocols}consistencyStrategy" minOccurs="0"/>
 *         &lt;element name="gn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fopt" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
    "cr",
    "mt",
    "cnm",
    "mnm",
    "mid",
    "macp",
    "mtv",
    "csy",
    "gn",
    "fopt",
    "ch",
    "sub"
})
@XmlRootElement(name = "grp")
public class Grp
    extends AnnounceableResource
{

    protected String cr;
    @XmlElement(required = true)
    protected BigInteger mt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cnm;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mnm;
    @XmlList
    @XmlElement(required = true)
    protected List<String> mid;
    @XmlList
    protected List<String> macp;
    protected boolean mtv;
    protected BigInteger csy;
    protected String gn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String fopt;
    protected List<ChildResourceRef> ch;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Sub> sub;

    /**
     * Gets the value of the cr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCr() {
        return cr;
    }

    /**
     * Sets the value of the cr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCr(String value) {
        this.cr = value;
    }

    /**
     * Gets the value of the mt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMt() {
        return mt;
    }

    /**
     * Sets the value of the mt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMt(BigInteger value) {
        this.mt = value;
    }

    /**
     * Gets the value of the cnm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnm() {
        return cnm;
    }

    /**
     * Sets the value of the cnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnm(BigInteger value) {
        this.cnm = value;
    }

    /**
     * Gets the value of the mnm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMnm() {
        return mnm;
    }

    /**
     * Sets the value of the mnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMnm(BigInteger value) {
        this.mnm = value;
    }

    /**
     * Gets the value of the mid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMid() {
        if (mid == null) {
            mid = new ArrayList<String>();
        }
        return this.mid;
    }

    /**
     * Gets the value of the macp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMacp() {
        if (macp == null) {
            macp = new ArrayList<String>();
        }
        return this.macp;
    }

    /**
     * Gets the value of the mtv property.
     * 
     */
    public boolean isMtv() {
        return mtv;
    }

    /**
     * Sets the value of the mtv property.
     * 
     */
    public void setMtv(boolean value) {
        this.mtv = value;
    }

    /**
     * Gets the value of the csy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCsy() {
        return csy;
    }

    /**
     * Sets the value of the csy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCsy(BigInteger value) {
        this.csy = value;
    }

    /**
     * Gets the value of the gn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGn() {
        return gn;
    }

    /**
     * Sets the value of the gn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGn(String value) {
        this.gn = value;
    }

    /**
     * Gets the value of the fopt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFopt() {
        return fopt;
    }

    /**
     * Sets the value of the fopt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFopt(String value) {
        this.fopt = value;
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
