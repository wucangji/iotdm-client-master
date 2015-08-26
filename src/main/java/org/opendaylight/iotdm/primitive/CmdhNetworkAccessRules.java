//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.26 at 02:52:08 PM EDT 
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
 *         &lt;element name="applicableEventCategories" type="{http://www.onem2m.org/xml/protocols}listOfEventCatWithDef"/>
 *         &lt;element name="mgmtLink" type="{http://www.onem2m.org/xml/protocols}mgmtLinkRef" maxOccurs="unbounded" minOccurs="0"/>
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
    "applicableEventCategories",
    "mgmtLink"
})
@XmlRootElement(name = "cmdhNetworkAccessRules")
public class CmdhNetworkAccessRules
    extends MgmtResource
{

    @XmlList
    @XmlElement(required = true)
    protected List<String> applicableEventCategories;
    protected List<MgmtLinkRef> mgmtLink;

    /**
     * Gets the value of the applicableEventCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableEventCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableEventCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableEventCategories() {
        if (applicableEventCategories == null) {
            applicableEventCategories = new ArrayList<String>();
        }
        return this.applicableEventCategories;
    }

    /**
     * Gets the value of the mgmtLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mgmtLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMgmtLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MgmtLinkRef }
     * 
     * 
     */
    public List<MgmtLinkRef> getMgmtLink() {
        if (mgmtLink == null) {
            mgmtLink = new ArrayList<MgmtLinkRef>();
        }
        return this.mgmtLink;
    }

}
