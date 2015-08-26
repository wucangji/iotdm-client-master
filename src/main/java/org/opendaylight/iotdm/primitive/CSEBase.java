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
import javax.xml.bind.annotation.XmlElements;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}resource">
 *       &lt;sequence>
 *         &lt;element name="accessControlPolicyIDs" type="{http://www.onem2m.org/xml/protocols}acpType" minOccurs="0"/>
 *         &lt;element name="cseType" type="{http://www.onem2m.org/xml/protocols}cseTypeID" minOccurs="0"/>
 *         &lt;element name="CSE-ID" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="supportedResourceType">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.onem2m.org/xml/protocols}resourceType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pointOfAccess" type="{http://www.onem2m.org/xml/protocols}poaList"/>
 *         &lt;element name="nodeLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}remoteCSE"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}node"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}AE"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}container"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}group"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}accessControlPolicy"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}mgmtCmd"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}locationPolicy"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}statsConfig"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}statsCollect"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}request"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}delivery"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}schedule"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}m2mServiceSubscriptionProfile"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}serviceSubscribedAppRule"/>
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
    "accessControlPolicyIDs",
    "cseType",
    "cseid",
    "supportedResourceType",
    "pointOfAccess",
    "nodeLink",
    "childResource",
    "remoteCSEOrNodeOrAE"
})
@XmlRootElement(name = "CSEBase")
public class CSEBase
    extends Resource
{

    @XmlList
    protected List<String> accessControlPolicyIDs;
    protected BigInteger cseType;
    @XmlElement(name = "CSE-ID", required = true)
    protected String cseid;
    @XmlList
    @XmlElement(required = true)
    protected List<BigInteger> supportedResourceType;
    @XmlList
    @XmlElement(required = true)
    protected List<String> pointOfAccess;
    @XmlSchemaType(name = "anyURI")
    protected String nodeLink;
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "remoteCSE", namespace = "http://www.onem2m.org/xml/protocols", type = RemoteCSE.class),
        @XmlElement(name = "node", namespace = "http://www.onem2m.org/xml/protocols", type = Node.class),
        @XmlElement(name = "AE", namespace = "http://www.onem2m.org/xml/protocols", type = AE.class),
        @XmlElement(name = "container", namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
        @XmlElement(name = "group", namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
        @XmlElement(name = "accessControlPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "mgmtCmd", namespace = "http://www.onem2m.org/xml/protocols", type = MgmtCmd.class),
        @XmlElement(name = "locationPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicy.class),
        @XmlElement(name = "statsConfig", namespace = "http://www.onem2m.org/xml/protocols", type = StatsConfig.class),
        @XmlElement(name = "statsCollect", namespace = "http://www.onem2m.org/xml/protocols", type = StatsCollect.class),
        @XmlElement(name = "request", namespace = "http://www.onem2m.org/xml/protocols", type = Request.class),
        @XmlElement(name = "delivery", namespace = "http://www.onem2m.org/xml/protocols", type = Delivery.class),
        @XmlElement(name = "schedule", namespace = "http://www.onem2m.org/xml/protocols", type = Schedule.class),
        @XmlElement(name = "m2mServiceSubscriptionProfile", namespace = "http://www.onem2m.org/xml/protocols", type = M2MServiceSubscriptionProfile.class),
        @XmlElement(name = "serviceSubscribedAppRule", namespace = "http://www.onem2m.org/xml/protocols", type = ServiceSubscribedAppRule.class)
    })
    protected List<Resource> remoteCSEOrNodeOrAE;

    /**
     * Gets the value of the accessControlPolicyIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessControlPolicyIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessControlPolicyIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccessControlPolicyIDs() {
        if (accessControlPolicyIDs == null) {
            accessControlPolicyIDs = new ArrayList<String>();
        }
        return this.accessControlPolicyIDs;
    }

    /**
     * Gets the value of the cseType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCseType() {
        return cseType;
    }

    /**
     * Sets the value of the cseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCseType(BigInteger value) {
        this.cseType = value;
    }

    /**
     * Gets the value of the cseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSEID() {
        return cseid;
    }

    /**
     * Sets the value of the cseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSEID(String value) {
        this.cseid = value;
    }

    /**
     * Gets the value of the supportedResourceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedResourceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedResourceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSupportedResourceType() {
        if (supportedResourceType == null) {
            supportedResourceType = new ArrayList<BigInteger>();
        }
        return this.supportedResourceType;
    }

    /**
     * Gets the value of the pointOfAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPointOfAccess() {
        if (pointOfAccess == null) {
            pointOfAccess = new ArrayList<String>();
        }
        return this.pointOfAccess;
    }

    /**
     * Gets the value of the nodeLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeLink() {
        return nodeLink;
    }

    /**
     * Sets the value of the nodeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeLink(String value) {
        this.nodeLink = value;
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
     * Gets the value of the remoteCSEOrNodeOrAE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteCSEOrNodeOrAE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteCSEOrNodeOrAE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteCSE }
     * {@link Node }
     * {@link AE }
     * {@link Container }
     * {@link Group }
     * {@link AccessControlPolicy }
     * {@link Subscription }
     * {@link MgmtCmd }
     * {@link LocationPolicy }
     * {@link StatsConfig }
     * {@link StatsCollect }
     * {@link Request }
     * {@link Delivery }
     * {@link Schedule }
     * {@link M2MServiceSubscriptionProfile }
     * {@link ServiceSubscribedAppRule }
     * 
     * 
     */
    public List<Resource> getRemoteCSEOrNodeOrAE() {
        if (remoteCSEOrNodeOrAE == null) {
            remoteCSEOrNodeOrAE = new ArrayList<Resource>();
        }
        return this.remoteCSEOrNodeOrAE;
    }

}
