//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.26 at 02:35:22 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedSubordinateResource">
 *       &lt;sequence>
 *         &lt;element name="scheduleElement" type="{http://www.onem2m.org/xml/protocols}scheduleEntries" minOccurs="0"/>
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
    "scheduleElement"
})
@XmlRootElement(name = "scheduleAnnc")
public class ScheduleAnnc
    extends AnnouncedSubordinateResource
{

    protected ScheduleEntries scheduleElement;

    /**
     * Gets the value of the scheduleElement property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleEntries }
     *     
     */
    public ScheduleEntries getScheduleElement() {
        return scheduleElement;
    }

    /**
     * Sets the value of the scheduleElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleEntries }
     *     
     */
    public void setScheduleElement(ScheduleEntries value) {
        this.scheduleElement = value;
    }

}
