//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.09 at 11:35:32 AM EDT 
//


package org.opendaylight.iotdm.primitive;

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
 *         &lt;element name="pollingChannelURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
    "pollingChannelURI"
})
@XmlRootElement(name = "pollingChannel")
public class PollingChannel
    extends RegularResource
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String pollingChannelURI;

    /**
     * Gets the value of the pollingChannelURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollingChannelURI() {
        return pollingChannelURI;
    }

    /**
     * Sets the value of the pollingChannelURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollingChannelURI(String value) {
        this.pollingChannelURI = value;
    }

}
