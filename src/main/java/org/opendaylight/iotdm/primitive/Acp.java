//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 02:34:26 PM EDT 
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableSubordinateResource">
 *       &lt;sequence>
 *         &lt;element name="pv" type="{http://www.onem2m.org/xml/protocols}setOfAcrs"/>
 *         &lt;element name="pvs" type="{http://www.onem2m.org/xml/protocols}setOfAcrs"/>
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
    "pv",
    "pvs",
    "ch",
    "sub"
})
@XmlRootElement(name = "acp")
public class Acp
    extends AnnounceableSubordinateResource
{

    @XmlElement(required = true)
    protected SetOfAcrs pv;
    @XmlElement(required = true)
    protected SetOfAcrs pvs;
    protected List<ChildResourceRef> ch;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Sub> sub;

    /**
     * Gets the value of the pv property.
     * 
     * @return
     *     possible object is
     *     {@link SetOfAcrs }
     *     
     */
    public SetOfAcrs getPv() {
        return pv;
    }

    /**
     * Sets the value of the pv property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOfAcrs }
     *     
     */
    public void setPv(SetOfAcrs value) {
        this.pv = value;
    }

    /**
     * Gets the value of the pvs property.
     * 
     * @return
     *     possible object is
     *     {@link SetOfAcrs }
     *     
     */
    public SetOfAcrs getPvs() {
        return pvs;
    }

    /**
     * Sets the value of the pvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetOfAcrs }
     *     
     */
    public void setPvs(SetOfAcrs value) {
        this.pvs = value;
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
