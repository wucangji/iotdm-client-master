//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.10 at 03:29:07 PM EDT 
//


package org.opendaylight.iotdm.primitive;

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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="activeCmdhPolicyLink" type="{http://www.onem2m.org/xml/protocols}ID"/>
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
    "activeCmdhPolicyLink"
})
@XmlRootElement(name = "activeCmdhPolicy")
public class ActiveCmdhPolicy
    extends MgmtResource
{

    @XmlElement(required = true)
    protected String activeCmdhPolicyLink;

    /**
     * Gets the value of the activeCmdhPolicyLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveCmdhPolicyLink() {
        return activeCmdhPolicyLink;
    }

    /**
     * Sets the value of the activeCmdhPolicyLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveCmdhPolicyLink(String value) {
        this.activeCmdhPolicyLink = value;
    }

}
