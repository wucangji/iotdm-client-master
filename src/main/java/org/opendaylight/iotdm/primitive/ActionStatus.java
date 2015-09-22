//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 02:34:26 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acn" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="sus" type="{http://www.onem2m.org/xml/protocols}status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionStatus", propOrder = {
    "acn",
    "sus"
})
public class ActionStatus {

    @XmlSchemaType(name = "anyURI")
    protected String acn;
    protected BigInteger sus;

    /**
     * Gets the value of the acn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcn() {
        return acn;
    }

    /**
     * Sets the value of the acn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcn(String value) {
        this.acn = value;
    }

    /**
     * Gets the value of the sus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSus() {
        return sus;
    }

    /**
     * Sets the value of the sus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSus(BigInteger value) {
        this.sus = value;
    }

}
