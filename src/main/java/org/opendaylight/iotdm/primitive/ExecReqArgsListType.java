//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.21 at 02:34:26 PM EDT 
//


package org.opendaylight.iotdm.primitive;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for execReqArgsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="execReqArgsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="rst" type="{http://www.onem2m.org/xml/protocols}resetArgsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rbo" type="{http://www.onem2m.org/xml/protocols}rebootArgsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uld" type="{http://www.onem2m.org/xml/protocols}uploadArgsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dld" type="{http://www.onem2m.org/xml/protocols}downloadArgsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="swin" type="{http://www.onem2m.org/xml/protocols}softwareInstallArgsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="swup" type="{http://www.onem2m.org/xml/protocols}softwareUpdateArgsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="swun" type="{http://www.onem2m.org/xml/protocols}softwareUninstallArgsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "execReqArgsListType", propOrder = {
    "rst",
    "rbo",
    "uld",
    "dld",
    "swin",
    "swup",
    "swun"
})
public class ExecReqArgsListType {

    protected List<ResetArgsType> rst;
    protected List<RebootArgsType> rbo;
    protected List<UploadArgsType> uld;
    protected List<DownloadArgsType> dld;
    protected List<SoftwareInstallArgsType> swin;
    protected List<SoftwareUpdateArgsType> swup;
    protected List<SoftwareUninstallArgsType> swun;

    /**
     * Gets the value of the rst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResetArgsType }
     * 
     * 
     */
    public List<ResetArgsType> getRst() {
        if (rst == null) {
            rst = new ArrayList<ResetArgsType>();
        }
        return this.rst;
    }

    /**
     * Gets the value of the rbo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rbo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRbo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RebootArgsType }
     * 
     * 
     */
    public List<RebootArgsType> getRbo() {
        if (rbo == null) {
            rbo = new ArrayList<RebootArgsType>();
        }
        return this.rbo;
    }

    /**
     * Gets the value of the uld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadArgsType }
     * 
     * 
     */
    public List<UploadArgsType> getUld() {
        if (uld == null) {
            uld = new ArrayList<UploadArgsType>();
        }
        return this.uld;
    }

    /**
     * Gets the value of the dld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DownloadArgsType }
     * 
     * 
     */
    public List<DownloadArgsType> getDld() {
        if (dld == null) {
            dld = new ArrayList<DownloadArgsType>();
        }
        return this.dld;
    }

    /**
     * Gets the value of the swin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareInstallArgsType }
     * 
     * 
     */
    public List<SoftwareInstallArgsType> getSwin() {
        if (swin == null) {
            swin = new ArrayList<SoftwareInstallArgsType>();
        }
        return this.swin;
    }

    /**
     * Gets the value of the swup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareUpdateArgsType }
     * 
     * 
     */
    public List<SoftwareUpdateArgsType> getSwup() {
        if (swup == null) {
            swup = new ArrayList<SoftwareUpdateArgsType>();
        }
        return this.swup;
    }

    /**
     * Gets the value of the swun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareUninstallArgsType }
     * 
     * 
     */
    public List<SoftwareUninstallArgsType> getSwun() {
        if (swun == null) {
            swun = new ArrayList<SoftwareUninstallArgsType>();
        }
        return this.swun;
    }

}
