//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.09 at 11:35:32 AM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for announcedResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="announcedResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}resource">
 *       &lt;sequence>
 *         &lt;element name="accessControlPolicyIDs" type="{http://www.onem2m.org/xml/protocols}acpType"/>
 *         &lt;element name="expirationTime" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "announcedResource", propOrder = {
    "accessControlPolicyIDs",
    "expirationTime",
    "link"
})
@XmlSeeAlso({
    RemoteCSEAnnc.class,
    GroupAnnc.class,
    ContainerAnnc.class,
    AEAnnc.class,
    AnnouncedMgmtResource.class,
    LocationPolicyAnnc.class
})
public class AnnouncedResource
    extends Resource
{

    @XmlList
    @XmlElement(required = true)
    protected List<String> accessControlPolicyIDs;
    @XmlElement(required = true)
    protected String expirationTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String link;

    /**
     * Gets the value of the accessControlPolicyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessControlPolicyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessControlPolicyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccessControlPolicyIDs() {
        if (accessControlPolicyIDs == null) {
            accessControlPolicyIDs = new ArrayList<String>();
        }
        return this.accessControlPolicyIDs;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationTime(String value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

}
