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
 *         &lt;element name="stateTag" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="source" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="target" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="lifespan" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *         &lt;element name="eventCat" type="{http://www.onem2m.org/xml/protocols}eventCat"/>
 *         &lt;element name="deliveryMetaData" type="{http://www.onem2m.org/xml/protocols}deliveryMetaData"/>
 *         &lt;element name="aggregatedRequest" type="{http://www.onem2m.org/xml/protocols}aggregatedRequest"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
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
    "stateTag",
    "source",
    "target",
    "lifespan",
    "eventCat",
    "deliveryMetaData",
    "aggregatedRequest",
    "childResource",
    "subscription"
})
@XmlRootElement(name = "delivery")
public class Delivery
    extends RegularResource
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger stateTag;
    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String target;
    @XmlElement(required = true)
    protected String lifespan;
    @XmlElement(required = true)
    protected String eventCat;
    @XmlElement(required = true)
    protected DeliveryMetaData deliveryMetaData;
    @XmlElement(required = true)
    protected AggregatedRequest aggregatedRequest;
    protected List<ChildResourceRef> childResource;
    @XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the stateTag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStateTag() {
        return stateTag;
    }

    /**
     * Sets the value of the stateTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStateTag(BigInteger value) {
        this.stateTag = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the lifespan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifespan() {
        return lifespan;
    }

    /**
     * Sets the value of the lifespan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifespan(String value) {
        this.lifespan = value;
    }

    /**
     * Gets the value of the eventCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCat() {
        return eventCat;
    }

    /**
     * Sets the value of the eventCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCat(String value) {
        this.eventCat = value;
    }

    /**
     * Gets the value of the deliveryMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMetaData }
     *     
     */
    public DeliveryMetaData getDeliveryMetaData() {
        return deliveryMetaData;
    }

    /**
     * Sets the value of the deliveryMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMetaData }
     *     
     */
    public void setDeliveryMetaData(DeliveryMetaData value) {
        this.deliveryMetaData = value;
    }

    /**
     * Gets the value of the aggregatedRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatedRequest }
     *     
     */
    public AggregatedRequest getAggregatedRequest() {
        return aggregatedRequest;
    }

    /**
     * Sets the value of the aggregatedRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatedRequest }
     *     
     */
    public void setAggregatedRequest(AggregatedRequest value) {
        this.aggregatedRequest = value;
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