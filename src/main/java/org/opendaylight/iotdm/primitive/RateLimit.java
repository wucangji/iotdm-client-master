//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.26 at 02:52:08 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for rateLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxNrOfNotify" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="timeWindow" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateLimit", propOrder = {
    "maxNrOfNotify",
    "timeWindow"
})
public class RateLimit {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNrOfNotify;
    protected Duration timeWindow;

    /**
     * Gets the value of the maxNrOfNotify property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNrOfNotify() {
        return maxNrOfNotify;
    }

    /**
     * Sets the value of the maxNrOfNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNrOfNotify(BigInteger value) {
        this.maxNrOfNotify = value;
    }

    /**
     * Gets the value of the timeWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeWindow() {
        return timeWindow;
    }

    /**
     * Sets the value of the timeWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeWindow(Duration value) {
        this.timeWindow = value;
    }

}