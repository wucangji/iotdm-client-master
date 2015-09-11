//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.11 at 01:56:01 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for metaInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metaInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceType" type="{http://www.onem2m.org/xml/protocols}resourceType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="originatingTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="requestExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="resultExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="operationExecutionTime" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://www.onem2m.org/xml/protocols}responseTypeInfo" minOccurs="0"/>
 *         &lt;element name="resultPersistence" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="resultContent" type="{http://www.onem2m.org/xml/protocols}resultContent" minOccurs="0"/>
 *         &lt;element name="eventCategory" type="{http://www.onem2m.org/xml/protocols}eventCat" minOccurs="0"/>
 *         &lt;element name="deliveryAggregation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupRequestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterCriteria" type="{http://www.onem2m.org/xml/protocols}filterCriteria" minOccurs="0"/>
 *         &lt;element name="discoveryResultType" type="{http://www.onem2m.org/xml/protocols}discResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaInformation", propOrder = {
    "resourceType",
    "name",
    "originatingTimestamp",
    "requestExpirationTimestamp",
    "resultExpirationTimestamp",
    "operationExecutionTime",
    "responseType",
    "resultPersistence",
    "resultContent",
    "eventCategory",
    "deliveryAggregation",
    "groupRequestIdentifier",
    "filterCriteria",
    "discoveryResultType"
})
public class MetaInformation {

    protected BigInteger resourceType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    protected String originatingTimestamp;
    protected String requestExpirationTimestamp;
    protected String resultExpirationTimestamp;
    protected String operationExecutionTime;
    protected ResponseTypeInfo responseType;
    protected Duration resultPersistence;
    protected BigInteger resultContent;
    protected String eventCategory;
    protected Boolean deliveryAggregation;
    protected String groupRequestIdentifier;
    protected FilterCriteria filterCriteria;
    protected BigInteger discoveryResultType;

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResourceType(BigInteger value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the originatingTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingTimestamp() {
        return originatingTimestamp;
    }

    /**
     * Sets the value of the originatingTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingTimestamp(String value) {
        this.originatingTimestamp = value;
    }

    /**
     * Gets the value of the requestExpirationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestExpirationTimestamp() {
        return requestExpirationTimestamp;
    }

    /**
     * Sets the value of the requestExpirationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestExpirationTimestamp(String value) {
        this.requestExpirationTimestamp = value;
    }

    /**
     * Gets the value of the resultExpirationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultExpirationTimestamp() {
        return resultExpirationTimestamp;
    }

    /**
     * Sets the value of the resultExpirationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultExpirationTimestamp(String value) {
        this.resultExpirationTimestamp = value;
    }

    /**
     * Gets the value of the operationExecutionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationExecutionTime() {
        return operationExecutionTime;
    }

    /**
     * Sets the value of the operationExecutionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationExecutionTime(String value) {
        this.operationExecutionTime = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTypeInfo }
     *     
     */
    public ResponseTypeInfo getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTypeInfo }
     *     
     */
    public void setResponseType(ResponseTypeInfo value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the resultPersistence property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getResultPersistence() {
        return resultPersistence;
    }

    /**
     * Sets the value of the resultPersistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setResultPersistence(Duration value) {
        this.resultPersistence = value;
    }

    /**
     * Gets the value of the resultContent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultContent() {
        return resultContent;
    }

    /**
     * Sets the value of the resultContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultContent(BigInteger value) {
        this.resultContent = value;
    }

    /**
     * Gets the value of the eventCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCategory() {
        return eventCategory;
    }

    /**
     * Sets the value of the eventCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCategory(String value) {
        this.eventCategory = value;
    }

    /**
     * Gets the value of the deliveryAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryAggregation() {
        return deliveryAggregation;
    }

    /**
     * Sets the value of the deliveryAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryAggregation(Boolean value) {
        this.deliveryAggregation = value;
    }

    /**
     * Gets the value of the groupRequestIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupRequestIdentifier() {
        return groupRequestIdentifier;
    }

    /**
     * Sets the value of the groupRequestIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupRequestIdentifier(String value) {
        this.groupRequestIdentifier = value;
    }

    /**
     * Gets the value of the filterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FilterCriteria }
     *     
     */
    public FilterCriteria getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the value of the filterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCriteria }
     *     
     */
    public void setFilterCriteria(FilterCriteria value) {
        this.filterCriteria = value;
    }

    /**
     * Gets the value of the discoveryResultType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscoveryResultType() {
        return discoveryResultType;
    }

    /**
     * Sets the value of the discoveryResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiscoveryResultType(BigInteger value) {
        this.discoveryResultType = value;
    }

}
