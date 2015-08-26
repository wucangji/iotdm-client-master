//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.26 at 02:35:22 PM EDT 
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
 * <p>Java class for announcedMgmtResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="announcedMgmtResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedResource">
 *       &lt;sequence>
 *         &lt;element name="mgmtDefinition" type="{http://www.onem2m.org/xml/protocols}mgmtDefinition"/>
 *         &lt;element name="objectIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="objectPaths" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "announcedMgmtResource", propOrder = {
    "mgmtDefinition",
    "objectIDs",
    "objectPaths",
    "description"
})
@XmlSeeAlso({
    EventLogAnnc.class,
    RebootAnnc.class,
    DeviceCapabilityAnnc.class,
    DeviceInfoAnnc.class,
    SoftwareAnnc.class,
    FirmwareAnnc.class,
    AreaNwkDeviceInfoAnnc.class,
    AreaNwkInfoAnnc.class,
    BatteryAnnc.class,
    MemoryAnnc.class
})
public class AnnouncedMgmtResource
    extends AnnouncedResource
{

    @XmlElement(required = true)
    protected BigInteger mgmtDefinition;
    @XmlList
    protected List<String> objectIDs;
    @XmlList
    protected List<String> objectPaths;
    protected String description;

    /**
     * Gets the value of the mgmtDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMgmtDefinition() {
        return mgmtDefinition;
    }

    /**
     * Sets the value of the mgmtDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMgmtDefinition(BigInteger value) {
        this.mgmtDefinition = value;
    }

    /**
     * Gets the value of the objectIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectIDs() {
        if (objectIDs == null) {
            objectIDs = new ArrayList<String>();
        }
        return this.objectIDs;
    }

    /**
     * Gets the value of the objectPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectPaths() {
        if (objectPaths == null) {
            objectPaths = new ArrayList<String>();
        }
        return this.objectPaths;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
