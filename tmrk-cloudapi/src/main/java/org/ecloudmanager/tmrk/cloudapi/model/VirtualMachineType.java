//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911
// .1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.16 at 03:24:22 PM EEST 
//


package org.ecloudmanager.tmrk.cloudapi.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="VirtualMachineType">
 *   &lt;complexContent>
 *     &lt;extension base="{}DeviceType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{}VirtualMachineStatus" minOccurs="0"/>
 *         &lt;element name="PoweredOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HardwareConfiguration" type="{}HardwareConfigurationType" minOccurs="0"/>
 *         &lt;element name="IpAddresses" type="{}VirtualMachineIpAddressesType" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ToolsStatus" type="{}ToolsStatus" minOccurs="0"/>
 *         &lt;element name="MediaStatus" type="{}VirtualMachineMediaStatus" minOccurs="0"/>
 *         &lt;element name="CustomizationPending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PendingRetryOperation" type="{}ReferenceType" minOccurs="0"/>
 *         &lt;element name="CloudServices" type="{}CloudServiceReferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineType", propOrder = {
    "status",
    "poweredOn",
    "hardwareConfiguration",
    "ipAddresses",
    "operatingSystem",
    "toolsStatus",
    "mediaStatus",
    "customizationPending",
    "pendingRetryOperation",
    "cloudServices"
})
public class VirtualMachineType
    extends DeviceType {

    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<VirtualMachineStatus> status;
    @XmlElementRef(name = "PoweredOn", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> poweredOn;
    @XmlElementRef(name = "HardwareConfiguration", type = JAXBElement.class, required = false)
    protected JAXBElement<HardwareConfigurationType> hardwareConfiguration;
    @XmlElementRef(name = "IpAddresses", type = JAXBElement.class, required = false)
    protected JAXBElement<VirtualMachineIpAddressesType> ipAddresses;
    @XmlElementRef(name = "OperatingSystem", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceType> operatingSystem;
    @XmlElementRef(name = "ToolsStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<ToolsStatus> toolsStatus;
    @XmlElementRef(name = "MediaStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<VirtualMachineMediaStatus> mediaStatus;
    @XmlElementRef(name = "CustomizationPending", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> customizationPending;
    @XmlElementRef(name = "PendingRetryOperation", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenceType> pendingRetryOperation;
    @XmlElementRef(name = "CloudServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CloudServiceReferencesType> cloudServices;

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link VirtualMachineStatus }{@code >}
     */
    public JAXBElement<VirtualMachineStatus> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link VirtualMachineStatus }{@code >}
     */
    public void setStatus(JAXBElement<VirtualMachineStatus> value) {
        this.status = value;
    }

    /**
     * Gets the value of the poweredOn property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getPoweredOn() {
        return poweredOn;
    }

    /**
     * Sets the value of the poweredOn property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setPoweredOn(JAXBElement<Boolean> value) {
        this.poweredOn = value;
    }

    /**
     * Gets the value of the hardwareConfiguration property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link HardwareConfigurationType }{@code >}
     */
    public JAXBElement<HardwareConfigurationType> getHardwareConfiguration() {
        return hardwareConfiguration;
    }

    /**
     * Sets the value of the hardwareConfiguration property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link HardwareConfigurationType }{@code >}
     */
    public void setHardwareConfiguration(JAXBElement<HardwareConfigurationType> value) {
        this.hardwareConfiguration = value;
    }

    /**
     * Gets the value of the ipAddresses property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link VirtualMachineIpAddressesType }{@code >}
     */
    public JAXBElement<VirtualMachineIpAddressesType> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * Sets the value of the ipAddresses property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link VirtualMachineIpAddressesType }{@code >}
     */
    public void setIpAddresses(JAXBElement<VirtualMachineIpAddressesType> value) {
        this.ipAddresses = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    public JAXBElement<ReferenceType> getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    public void setOperatingSystem(JAXBElement<ReferenceType> value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the toolsStatus property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ToolsStatus }{@code >}
     */
    public JAXBElement<ToolsStatus> getToolsStatus() {
        return toolsStatus;
    }

    /**
     * Sets the value of the toolsStatus property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ToolsStatus }{@code >}
     */
    public void setToolsStatus(JAXBElement<ToolsStatus> value) {
        this.toolsStatus = value;
    }

    /**
     * Gets the value of the mediaStatus property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link VirtualMachineMediaStatus }{@code >}
     */
    public JAXBElement<VirtualMachineMediaStatus> getMediaStatus() {
        return mediaStatus;
    }

    /**
     * Sets the value of the mediaStatus property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link VirtualMachineMediaStatus }{@code >}
     */
    public void setMediaStatus(JAXBElement<VirtualMachineMediaStatus> value) {
        this.mediaStatus = value;
    }

    /**
     * Gets the value of the customizationPending property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public JAXBElement<Boolean> getCustomizationPending() {
        return customizationPending;
    }

    /**
     * Sets the value of the customizationPending property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    public void setCustomizationPending(JAXBElement<Boolean> value) {
        this.customizationPending = value;
    }

    /**
     * Gets the value of the pendingRetryOperation property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    public JAXBElement<ReferenceType> getPendingRetryOperation() {
        return pendingRetryOperation;
    }

    /**
     * Sets the value of the pendingRetryOperation property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     */
    public void setPendingRetryOperation(JAXBElement<ReferenceType> value) {
        this.pendingRetryOperation = value;
    }

    /**
     * Gets the value of the cloudServices property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link CloudServiceReferencesType }{@code >}
     */
    public JAXBElement<CloudServiceReferencesType> getCloudServices() {
        return cloudServices;
    }

    /**
     * Sets the value of the cloudServices property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link CloudServiceReferencesType }{@code >}
     */
    public void setCloudServices(JAXBElement<CloudServiceReferencesType> value) {
        this.cloudServices = value;
    }

}
