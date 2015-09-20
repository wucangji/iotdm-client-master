//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.19 at 11:59:33 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}regularResource">
 *       &lt;sequence>
 *         &lt;element name="ni" type="{http://www.onem2m.org/xml/protocols}nodeID"/>
 *         &lt;element name="csi" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="di" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.onem2m.org/xml/protocols}deviceID" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="rlk" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
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
    "ni",
    "csi",
    "di",
    "rlk",
    "ch",
    "sub"
})
@XmlRootElement(name = "svsn")
public class Svsn
    extends RegularResource
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ni;
    protected String csi;
    @XmlList
    protected List<String> di;
    @XmlList
    protected List<String> rlk;
    protected List<ChildResourceRef> ch;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Sub> sub;

    /**
     * Gets the value of the ni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNi() {
        return ni;
    }

    /**
     * Sets the value of the ni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNi(String value) {
        this.ni = value;
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
     * Gets the value of the di property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the di property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDi() {
        if (di == null) {
            di = new ArrayList<String>();
        }
        return this.di;
    }

    /**
     * Gets the value of the rlk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rlk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRlk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRlk() {
        if (rlk == null) {
            rlk = new ArrayList<String>();
        }
        return this.rlk;
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