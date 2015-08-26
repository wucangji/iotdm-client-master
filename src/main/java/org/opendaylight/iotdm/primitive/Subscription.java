//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.26 at 02:52:08 PM EDT 
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}regularResource">
 *       &lt;sequence>
 *         &lt;element name="eventNotificationCriteria" type="{http://www.onem2m.org/xml/protocols}eventNotificationCriteria" minOccurs="0"/>
 *         &lt;element name="expirationCounter" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="notificationURI" type="{http://www.onem2m.org/xml/protocols}listOfURIs"/>
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="notificationForwardingURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="batchNotify" type="{http://www.onem2m.org/xml/protocols}batchNotify" minOccurs="0"/>
 *         &lt;element name="rateLimit" type="{http://www.onem2m.org/xml/protocols}rateLimit" minOccurs="0"/>
 *         &lt;element name="preSubscriptionNotify" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="pendingNotification" type="{http://www.onem2m.org/xml/protocols}pendingNotification" minOccurs="0"/>
 *         &lt;element name="notificationStoragePriority" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="latestNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notificationContentType" type="{http://www.onem2m.org/xml/protocols}notificationContentType"/>
 *         &lt;element name="notificationEventCat" type="{http://www.onem2m.org/xml/protocols}eventCat" minOccurs="0"/>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="subscriberURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}schedule"/>
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
    "eventNotificationCriteria",
    "expirationCounter",
    "notificationURI",
    "groupID",
    "notificationForwardingURI",
    "batchNotify",
    "rateLimit",
    "preSubscriptionNotify",
    "pendingNotification",
    "notificationStoragePriority",
    "latestNotify",
    "notificationContentType",
    "notificationEventCat",
    "creator",
    "subscriberURI",
    "childResource",
    "schedule"
})
@XmlRootElement(name = "subscription")
public class Subscription
    extends RegularResource
{

    protected EventNotificationCriteria eventNotificationCriteria;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expirationCounter;
    @XmlList
    @XmlElement(required = true)
    protected List<String> notificationURI;
    @XmlSchemaType(name = "anyURI")
    protected String groupID;
    @XmlSchemaType(name = "anyURI")
    protected String notificationForwardingURI;
    protected BatchNotify batchNotify;
    protected RateLimit rateLimit;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger preSubscriptionNotify;
    protected BigInteger pendingNotification;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger notificationStoragePriority;
    protected Boolean latestNotify;
    @XmlElement(required = true)
    protected BigInteger notificationContentType;
    protected String notificationEventCat;
    protected String creator;
    @XmlSchemaType(name = "anyURI")
    protected String subscriberURI;
    protected ChildResourceRef childResource;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected Schedule schedule;

    /**
     * Gets the value of the eventNotificationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link EventNotificationCriteria }
     *     
     */
    public EventNotificationCriteria getEventNotificationCriteria() {
        return eventNotificationCriteria;
    }

    /**
     * Sets the value of the eventNotificationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventNotificationCriteria }
     *     
     */
    public void setEventNotificationCriteria(EventNotificationCriteria value) {
        this.eventNotificationCriteria = value;
    }

    /**
     * Gets the value of the expirationCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationCounter() {
        return expirationCounter;
    }

    /**
     * Sets the value of the expirationCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationCounter(BigInteger value) {
        this.expirationCounter = value;
    }

    /**
     * Gets the value of the notificationURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotificationURI() {
        if (notificationURI == null) {
            notificationURI = new ArrayList<String>();
        }
        return this.notificationURI;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the notificationForwardingURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationForwardingURI() {
        return notificationForwardingURI;
    }

    /**
     * Sets the value of the notificationForwardingURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationForwardingURI(String value) {
        this.notificationForwardingURI = value;
    }

    /**
     * Gets the value of the batchNotify property.
     * 
     * @return
     *     possible object is
     *     {@link BatchNotify }
     *     
     */
    public BatchNotify getBatchNotify() {
        return batchNotify;
    }

    /**
     * Sets the value of the batchNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchNotify }
     *     
     */
    public void setBatchNotify(BatchNotify value) {
        this.batchNotify = value;
    }

    /**
     * Gets the value of the rateLimit property.
     * 
     * @return
     *     possible object is
     *     {@link RateLimit }
     *     
     */
    public RateLimit getRateLimit() {
        return rateLimit;
    }

    /**
     * Sets the value of the rateLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLimit }
     *     
     */
    public void setRateLimit(RateLimit value) {
        this.rateLimit = value;
    }

    /**
     * Gets the value of the preSubscriptionNotify property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreSubscriptionNotify() {
        return preSubscriptionNotify;
    }

    /**
     * Sets the value of the preSubscriptionNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreSubscriptionNotify(BigInteger value) {
        this.preSubscriptionNotify = value;
    }

    /**
     * Gets the value of the pendingNotification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPendingNotification() {
        return pendingNotification;
    }

    /**
     * Sets the value of the pendingNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPendingNotification(BigInteger value) {
        this.pendingNotification = value;
    }

    /**
     * Gets the value of the notificationStoragePriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNotificationStoragePriority() {
        return notificationStoragePriority;
    }

    /**
     * Sets the value of the notificationStoragePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNotificationStoragePriority(BigInteger value) {
        this.notificationStoragePriority = value;
    }

    /**
     * Gets the value of the latestNotify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatestNotify() {
        return latestNotify;
    }

    /**
     * Sets the value of the latestNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatestNotify(Boolean value) {
        this.latestNotify = value;
    }

    /**
     * Gets the value of the notificationContentType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNotificationContentType() {
        return notificationContentType;
    }

    /**
     * Sets the value of the notificationContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNotificationContentType(BigInteger value) {
        this.notificationContentType = value;
    }

    /**
     * Gets the value of the notificationEventCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEventCat() {
        return notificationEventCat;
    }

    /**
     * Sets the value of the notificationEventCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEventCat(String value) {
        this.notificationEventCat = value;
    }

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
     * Gets the value of the subscriberURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberURI() {
        return subscriberURI;
    }

    /**
     * Sets the value of the subscriberURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberURI(String value) {
        this.subscriberURI = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * @return
     *     possible object is
     *     {@link ChildResourceRef }
     *     
     */
    public ChildResourceRef getChildResource() {
        return childResource;
    }

    /**
     * Sets the value of the childResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildResourceRef }
     *     
     */
    public void setChildResource(ChildResourceRef value) {
        this.childResource = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

}
