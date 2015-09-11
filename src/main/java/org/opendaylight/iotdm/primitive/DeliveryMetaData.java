//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.11 at 01:56:01 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="tracingOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="tracingInfo" type="{http://www.onem2m.org/xml/protocols}listOfM2MID" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryMetaData", propOrder = {
    "tracingOption",
    "tracingInfo"
})
public class DeliveryMetaData {

    protected boolean tracingOption;
    @XmlList
    protected List<String> tracingInfo;

    /**
     * Gets the value of the tracingOption property.
     * 
     */
    public boolean isTracingOption() {
        return tracingOption;
    }

    /**
     * Sets the value of the tracingOption property.
     * 
     */
    public void setTracingOption(boolean value) {
        this.tracingOption = value;
    }

    /**
     * Gets the value of the tracingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTracingInfo() {
        if (tracingInfo == null) {
            tracingInfo = new ArrayList<String>();
        }
        return this.tracingInfo;
    }

}
