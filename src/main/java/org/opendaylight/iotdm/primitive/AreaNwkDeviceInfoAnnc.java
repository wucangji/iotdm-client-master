//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.09 at 11:35:32 AM EDT 
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedMgmtResource">
 *       &lt;sequence>
 *         &lt;element name="devID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaNwkId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="sleepInterval" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="sleepDuration" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="devStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listOfNeighbors" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
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
    "devID",
    "devType",
    "areaNwkId",
    "sleepInterval",
    "sleepDuration",
    "devStatus",
    "listOfNeighbors",
    "childResource",
    "subscription"
})
@XmlRootElement(name = "areaNwkDeviceInfoAnnc")
public class AreaNwkDeviceInfoAnnc
    extends AnnouncedMgmtResource
{

    protected String devID;
    protected String devType;
    @XmlSchemaType(name = "anyURI")
    protected String areaNwkId;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sleepInterval;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sleepDuration;
    protected String devStatus;
    @XmlList
    protected List<String> listOfNeighbors;
    protected List<ChildResourceRef> childResource;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the devID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevID() {
        return devID;
    }

    /**
     * Sets the value of the devID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevID(String value) {
        this.devID = value;
    }

    /**
     * Gets the value of the devType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevType() {
        return devType;
    }

    /**
     * Sets the value of the devType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevType(String value) {
        this.devType = value;
    }

    /**
     * Gets the value of the areaNwkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaNwkId() {
        return areaNwkId;
    }

    /**
     * Sets the value of the areaNwkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaNwkId(String value) {
        this.areaNwkId = value;
    }

    /**
     * Gets the value of the sleepInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSleepInterval() {
        return sleepInterval;
    }

    /**
     * Sets the value of the sleepInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSleepInterval(BigInteger value) {
        this.sleepInterval = value;
    }

    /**
     * Gets the value of the sleepDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSleepDuration() {
        return sleepDuration;
    }

    /**
     * Sets the value of the sleepDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSleepDuration(BigInteger value) {
        this.sleepDuration = value;
    }

    /**
     * Gets the value of the devStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevStatus() {
        return devStatus;
    }

    /**
     * Sets the value of the devStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevStatus(String value) {
        this.devStatus = value;
    }

    /**
     * Gets the value of the listOfNeighbors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfNeighbors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfNeighbors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfNeighbors() {
        if (listOfNeighbors == null) {
            listOfNeighbors = new ArrayList<String>();
        }
        return this.listOfNeighbors;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
        if (childResource == null) {
            childResource = new ArrayList<ChildResourceRef>();
        }
        return this.childResource;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * 
     * 
     */
    public List<Subscription> getSubscription() {
        if (subscription == null) {
            subscription = new ArrayList<Subscription>();
        }
        return this.subscription;
    }

}
