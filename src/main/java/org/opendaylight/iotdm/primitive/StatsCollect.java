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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}regularResource">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="statsCollectID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="collectingEntityID" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="collectedEntityID" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="statsRuleStatus" type="{http://www.onem2m.org/xml/protocols}statsRuleStatusType"/>
 *         &lt;element name="statModel" type="{http://www.onem2m.org/xml/protocols}statModelType"/>
 *         &lt;element name="collectPeriod" type="{http://www.onem2m.org/xml/protocols}scheduleEntries" minOccurs="0"/>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "creator",
    "statsCollectID",
    "collectingEntityID",
    "collectedEntityID",
    "statsRuleStatus",
    "statModel",
    "collectPeriod",
    "eventID",
    "childResource",
    "subscription"
})
@XmlRootElement(name = "statsCollect")
public class StatsCollect
    extends RegularResource
{

    @XmlElement(required = true)
    protected String creator;
    @XmlElement(required = true)
    protected String statsCollectID;
    @XmlElement(required = true)
    protected String collectingEntityID;
    @XmlElement(required = true)
    protected String collectedEntityID;
    @XmlElement(required = true)
    protected BigInteger statsRuleStatus;
    @XmlElement(required = true)
    protected BigInteger statModel;
    protected ScheduleEntries collectPeriod;
    protected String eventID;
    protected List<ChildResourceRef> childResource;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the statsCollectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatsCollectID() {
        return statsCollectID;
    }

    /**
     * Sets the value of the statsCollectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatsCollectID(String value) {
        this.statsCollectID = value;
    }

    /**
     * Gets the value of the collectingEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectingEntityID() {
        return collectingEntityID;
    }

    /**
     * Sets the value of the collectingEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectingEntityID(String value) {
        this.collectingEntityID = value;
    }

    /**
     * Gets the value of the collectedEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectedEntityID() {
        return collectedEntityID;
    }

    /**
     * Sets the value of the collectedEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectedEntityID(String value) {
        this.collectedEntityID = value;
    }

    /**
     * Gets the value of the statsRuleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatsRuleStatus() {
        return statsRuleStatus;
    }

    /**
     * Sets the value of the statsRuleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatsRuleStatus(BigInteger value) {
        this.statsRuleStatus = value;
    }

    /**
     * Gets the value of the statModel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatModel() {
        return statModel;
    }

    /**
     * Sets the value of the statModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatModel(BigInteger value) {
        this.statModel = value;
    }

    /**
     * Gets the value of the collectPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleEntries }
     *     
     */
    public ScheduleEntries getCollectPeriod() {
        return collectPeriod;
    }

    /**
     * Sets the value of the collectPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleEntries }
     *     
     */
    public void setCollectPeriod(ScheduleEntries value) {
        this.collectPeriod = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
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
