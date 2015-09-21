//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 01:22:00 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nev" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rep" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="om" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="op" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
 *                             &lt;element name="org" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vrq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sud" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sur" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="cr" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="nfu" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notification", propOrder = {
    "nev",
    "vrq",
    "sud",
    "sur",
    "cr",
    "nfu"
})
public class Notification {

    protected Notification.Nev nev;
    protected Boolean vrq;
    protected Boolean sud;
    @XmlSchemaType(name = "anyURI")
    protected String sur;
    protected String cr;
    @XmlSchemaType(name = "anyURI")
    protected String nfu;

    /**
     * Gets the value of the nev property.
     * 
     * @return
     *     possible object is
     *     {@link Notification.Nev }
     *     
     */
    public Notification.Nev getNev() {
        return nev;
    }

    /**
     * Sets the value of the nev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification.Nev }
     *     
     */
    public void setNev(Notification.Nev value) {
        this.nev = value;
    }

    /**
     * Gets the value of the vrq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVrq() {
        return vrq;
    }

    /**
     * Sets the value of the vrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVrq(Boolean value) {
        this.vrq = value;
    }

    /**
     * Gets the value of the sud property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSud() {
        return sud;
    }

    /**
     * Sets the value of the sud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSud(Boolean value) {
        this.sud = value;
    }

    /**
     * Gets the value of the sur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSur() {
        return sur;
    }

    /**
     * Sets the value of the sur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSur(String value) {
        this.sur = value;
    }

    /**
     * Gets the value of the cr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCr() {
        return cr;
    }

    /**
     * Sets the value of the cr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCr(String value) {
        this.cr = value;
    }

    /**
     * Gets the value of the nfu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfu() {
        return nfu;
    }

    /**
     * Sets the value of the nfu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfu(String value) {
        this.nfu = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rep" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="om" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="op" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
     *                   &lt;element name="org" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rep",
        "om"
    })
    public static class Nev {

        protected Object rep;
        protected Notification.Nev.Om om;

        /**
         * Gets the value of the rep property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRep() {
            return rep;
        }

        /**
         * Sets the value of the rep property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRep(Object value) {
            this.rep = value;
        }

        /**
         * Gets the value of the om property.
         * 
         * @return
         *     possible object is
         *     {@link Notification.Nev.Om }
         *     
         */
        public Notification.Nev.Om getOm() {
            return om;
        }

        /**
         * Sets the value of the om property.
         * 
         * @param value
         *     allowed object is
         *     {@link Notification.Nev.Om }
         *     
         */
        public void setOm(Notification.Nev.Om value) {
            this.om = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="op" type="{http://www.onem2m.org/xml/protocols}operation" minOccurs="0"/>
         *         &lt;element name="org" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "op",
            "org"
        })
        public static class Om {

            protected BigInteger op;
            protected String org;

            /**
             * Gets the value of the op property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getOp() {
                return op;
            }

            /**
             * Sets the value of the op property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setOp(BigInteger value) {
                this.op = value;
            }

            /**
             * Gets the value of the org property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrg() {
                return org;
            }

            /**
             * Sets the value of the org property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrg(String value) {
                this.org = value;
            }

        }

    }

}
