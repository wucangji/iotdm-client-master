//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 01:22:00 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedMgmtResource">
 *       &lt;sequence>
 *         &lt;element name="vr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="in" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="un" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ins" type="{http://www.onem2m.org/xml/protocols}actionStatus" minOccurs="0"/>
 *         &lt;element name="act" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dea" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="acts" type="{http://www.onem2m.org/xml/protocols}actionStatus" minOccurs="0"/>
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
    "vr",
    "swn",
    "url",
    "in",
    "un",
    "ins",
    "act",
    "dea",
    "acts",
    "ch",
    "sub"
})
@XmlRootElement(name = "swrA")
public class SwrA
    extends AnnouncedMgmtResource
{

    protected String vr;
    protected String swn;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected Boolean in;
    protected Boolean un;
    protected ActionStatus ins;
    protected Boolean act;
    protected Boolean dea;
    protected ActionStatus acts;
    protected List<ChildResourceRef> ch;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Sub> sub;

    /**
     * Gets the value of the vr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVr() {
        return vr;
    }

    /**
     * Sets the value of the vr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVr(String value) {
        this.vr = value;
    }

    /**
     * Gets the value of the swn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwn() {
        return swn;
    }

    /**
     * Sets the value of the swn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwn(String value) {
        this.swn = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the in property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIn() {
        return in;
    }

    /**
     * Sets the value of the in property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIn(Boolean value) {
        this.in = value;
    }

    /**
     * Gets the value of the un property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUn() {
        return un;
    }

    /**
     * Sets the value of the un property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUn(Boolean value) {
        this.un = value;
    }

    /**
     * Gets the value of the ins property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getIns() {
        return ins;
    }

    /**
     * Sets the value of the ins property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setIns(ActionStatus value) {
        this.ins = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAct(Boolean value) {
        this.act = value;
    }

    /**
     * Gets the value of the dea property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDea() {
        return dea;
    }

    /**
     * Sets the value of the dea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDea(Boolean value) {
        this.dea = value;
    }

    /**
     * Gets the value of the acts property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getActs() {
        return acts;
    }

    /**
     * Sets the value of the acts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setActs(ActionStatus value) {
        this.acts = value;
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
