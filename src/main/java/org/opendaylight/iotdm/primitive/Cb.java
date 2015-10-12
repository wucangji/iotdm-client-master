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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}resource">
 *       &lt;sequence>
 *         &lt;element name="acpi" type="{http://www.onem2m.org/xml/protocols}acpType" minOccurs="0"/>
 *         &lt;element name="cst" type="{http://www.onem2m.org/xml/protocols}cseTypeID" minOccurs="0"/>
 *         &lt;element name="csi" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="srt">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.onem2m.org/xml/protocols}resourceType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="poa" type="{http://www.onem2m.org/xml/protocols}poaList"/>
 *         &lt;element name="nl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ch" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}csr"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}nod"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}ae"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}cnt"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}grp"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}acp"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}sub"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}mgc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}lcp"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}stcg"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}stcl"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}req"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}dlv"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}sch"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}mssp"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}asar"/>
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
    "acpi",
    "cst",
    "csi",
    "srt",
    "poa",
    "nl",
    "ch",
    "csrOrNodOrAe"
})
@XmlRootElement(name = "cb")
public class Cb
    extends Resource
{

    @XmlList
    protected List<String> acpi;
    protected BigInteger cst;
    @XmlElement(required = true)
    protected String csi;
    @XmlList
    @XmlElement(required = true)
    protected List<BigInteger> srt;
    @XmlList
    @XmlElement(required = true)
    protected List<String> poa;
    @XmlSchemaType(name = "anyURI")
    protected String nl;
    protected List<ChildResourceRef> ch;
    @XmlElements({
        @XmlElement(name = "csr", namespace = "http://www.onem2m.org/xml/protocols", type = Csr.class),
        @XmlElement(name = "nod", namespace = "http://www.onem2m.org/xml/protocols", type = Nod.class),
        @XmlElement(name = "ae", namespace = "http://www.onem2m.org/xml/protocols", type = Ae.class),
        @XmlElement(name = "cnt", namespace = "http://www.onem2m.org/xml/protocols", type = Cnt.class),
        @XmlElement(name = "grp", namespace = "http://www.onem2m.org/xml/protocols", type = Grp.class),
        @XmlElement(name = "acp", namespace = "http://www.onem2m.org/xml/protocols", type = Acp.class),
        @XmlElement(name = "sub", namespace = "http://www.onem2m.org/xml/protocols", type = Sub.class),
        @XmlElement(name = "mgc", namespace = "http://www.onem2m.org/xml/protocols", type = Mgc.class),
        @XmlElement(name = "lcp", namespace = "http://www.onem2m.org/xml/protocols", type = Lcp.class),
        @XmlElement(name = "stcg", namespace = "http://www.onem2m.org/xml/protocols", type = Stcg.class),
        @XmlElement(name = "stcl", namespace = "http://www.onem2m.org/xml/protocols", type = Stcl.class),
        @XmlElement(name = "req", namespace = "http://www.onem2m.org/xml/protocols", type = Req.class),
        @XmlElement(name = "dlv", namespace = "http://www.onem2m.org/xml/protocols", type = Dlv.class),
        @XmlElement(name = "sch", namespace = "http://www.onem2m.org/xml/protocols", type = Sch.class),
        @XmlElement(name = "mssp", namespace = "http://www.onem2m.org/xml/protocols", type = Mssp.class),
        @XmlElement(name = "asar", namespace = "http://www.onem2m.org/xml/protocols", type = Asar.class)
    })
    protected List<Resource> csrOrNodOrAe;

    /**
     * Gets the value of the acpi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acpi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcpi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcpi() {
        if (acpi == null) {
            acpi = new ArrayList<String>();
        }
        return this.acpi;
    }

    /**
     * Gets the value of the cst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCst() {
        return cst;
    }

    /**
     * Sets the value of the cst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCst(BigInteger value) {
        this.cst = value;
    }

    /**
     * Gets the value of the csi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsi() {
        return csi;
    }

    /**
     * Sets the value of the csi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsi(String value) {
        this.csi = value;
    }

    /**
     * Gets the value of the srt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSrt() {
        if (srt == null) {
            srt = new ArrayList<BigInteger>();
        }
        return this.srt;
    }

    /**
     * Gets the value of the poa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPoa() {
        if (poa == null) {
            poa = new ArrayList<String>();
        }
        return this.poa;
    }

    /**
     * Gets the value of the nl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNl() {
        return nl;
    }

    /**
     * Sets the value of the nl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNl(String value) {
        this.nl = value;
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
     * Gets the value of the csrOrNodOrAe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csrOrNodOrAe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsrOrNodOrAe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Csr }
     * {@link Nod }
     * {@link Ae }
     * {@link Cnt }
     * {@link Grp }
     * {@link Acp }
     * {@link Sub }
     * {@link Mgc }
     * {@link Lcp }
     * {@link Stcg }
     * {@link Stcl }
     * {@link Req }
     * {@link Dlv }
     * {@link Sch }
     * {@link Mssp }
     * {@link Asar }
     * 
     * 
     */
    public List<Resource> getCsrOrNodOrAe() {
        if (csrOrNodOrAe == null) {
            csrOrNodOrAe = new ArrayList<Resource>();
        }
        return this.csrOrNodOrAe;
    }

}
