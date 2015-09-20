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
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="ni" type="{http://www.onem2m.org/xml/protocols}nodeID"/>
 *         &lt;element name="hcl" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ch" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}mem"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}bat"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}ani"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}andi"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}fwr"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}swr"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}dvi"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}dvc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}rbo"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}evl"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}cmp"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}acmp"/>
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
    "ni",
    "hcl",
    "ch",
    "memOrBatOrAni"
})
@XmlRootElement(name = "nod")
public class Nod
    extends AnnounceableResource
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ni;
    protected String hcl;
    protected List<ChildResourceRef> ch;
    @XmlElements({
        @XmlElement(name = "mem", namespace = "http://www.onem2m.org/xml/protocols", type = Mem.class),
        @XmlElement(name = "bat", namespace = "http://www.onem2m.org/xml/protocols", type = Bat.class),
        @XmlElement(name = "ani", namespace = "http://www.onem2m.org/xml/protocols", type = Ani.class),
        @XmlElement(name = "andi", namespace = "http://www.onem2m.org/xml/protocols", type = Andi.class),
        @XmlElement(name = "fwr", namespace = "http://www.onem2m.org/xml/protocols", type = Fwr.class),
        @XmlElement(name = "swr", namespace = "http://www.onem2m.org/xml/protocols", type = Swr.class),
        @XmlElement(name = "dvi", namespace = "http://www.onem2m.org/xml/protocols", type = Dvi.class),
        @XmlElement(name = "dvc", namespace = "http://www.onem2m.org/xml/protocols", type = Dvc.class),
        @XmlElement(name = "rbo", namespace = "http://www.onem2m.org/xml/protocols", type = Rbo.class),
        @XmlElement(name = "evl", namespace = "http://www.onem2m.org/xml/protocols", type = Evl.class),
        @XmlElement(name = "cmp", namespace = "http://www.onem2m.org/xml/protocols", type = Cmp.class),
        @XmlElement(name = "acmp", namespace = "http://www.onem2m.org/xml/protocols", type = Acmp.class),
        @XmlElement(name = "sub", namespace = "http://www.onem2m.org/xml/protocols", type = Sub.class)
    })
    protected List<RegularResource> memOrBatOrAni;

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
     * Gets the value of the hcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcl() {
        return hcl;
    }

    /**
     * Sets the value of the hcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcl(String value) {
        this.hcl = value;
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
     * Gets the value of the memOrBatOrAni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memOrBatOrAni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemOrBatOrAni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mem }
     * {@link Bat }
     * {@link Ani }
     * {@link Andi }
     * {@link Fwr }
     * {@link Swr }
     * {@link Dvi }
     * {@link Dvc }
     * {@link Rbo }
     * {@link Evl }
     * {@link Cmp }
     * {@link Acmp }
     * {@link Sub }
     * 
     * 
     */
    public List<RegularResource> getMemOrBatOrAni() {
        if (memOrBatOrAni == null) {
            memOrBatOrAni = new ArrayList<RegularResource>();
        }
        return this.memOrBatOrAni;
    }

}
