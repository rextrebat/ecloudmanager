//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911
// .1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.16 at 03:24:22 PM EEST 
//


package org.ecloudmanager.tmrk.cloudapi.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for FirewallAclType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="FirewallAclType">
 *   &lt;complexContent>
 *     &lt;extension base="{}EntityType">
 *       &lt;sequence>
 *         &lt;element name="Permission" type="{}AclPermissionTypeEnum" minOccurs="0"/>
 *         &lt;element name="AclType" type="{}AclTypeEnum" minOccurs="0"/>
 *         &lt;element name="PortType" type="{}AclPortTypeEnum" minOccurs="0"/>
 *         &lt;element name="Protocol" type="{}ProtocolTypeEnum" minOccurs="0"/>
 *         &lt;element name="Source" type="{}FirewallAclEndpointType" minOccurs="0"/>
 *         &lt;element name="Destination" type="{}FirewallAclEndpointType" minOccurs="0"/>
 *         &lt;element name="PortRange" type="{}PortRangeType" minOccurs="0"/>
 *         &lt;element name="PortRanges" type="{}PortRangesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallAclType", propOrder = {
    "permission",
    "aclType",
    "portType",
    "protocol",
    "source",
    "destination",
    "portRange",
    "portRanges"
})
public class FirewallAclType
    extends EntityType {

    @XmlElement(name = "Permission")
    @XmlSchemaType(name = "string")
    protected AclPermissionTypeEnum permission;
    @XmlElement(name = "AclType")
    @XmlSchemaType(name = "string")
    protected AclTypeEnum aclType;
    @XmlElement(name = "PortType")
    @XmlSchemaType(name = "string")
    protected AclPortTypeEnum portType;
    @XmlElement(name = "Protocol")
    @XmlSchemaType(name = "string")
    protected ProtocolTypeEnum protocol;
    @XmlElementRef(name = "Source", type = JAXBElement.class, required = false)
    protected JAXBElement<FirewallAclEndpointType> source;
    @XmlElementRef(name = "Destination", type = JAXBElement.class, required = false)
    protected JAXBElement<FirewallAclEndpointType> destination;
    @XmlElementRef(name = "PortRange", type = JAXBElement.class, required = false)
    protected JAXBElement<PortRangeType> portRange;
    @XmlElementRef(name = "PortRanges", type = JAXBElement.class, required = false)
    protected JAXBElement<PortRangesType> portRanges;

    /**
     * Gets the value of the permission property.
     *
     * @return possible object is
     * {@link AclPermissionTypeEnum }
     */
    public AclPermissionTypeEnum getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     *
     * @param value allowed object is
     *              {@link AclPermissionTypeEnum }
     */
    public void setPermission(AclPermissionTypeEnum value) {
        this.permission = value;
    }

    /**
     * Gets the value of the aclType property.
     *
     * @return possible object is
     * {@link AclTypeEnum }
     */
    public AclTypeEnum getAclType() {
        return aclType;
    }

    /**
     * Sets the value of the aclType property.
     *
     * @param value allowed object is
     *              {@link AclTypeEnum }
     */
    public void setAclType(AclTypeEnum value) {
        this.aclType = value;
    }

    /**
     * Gets the value of the portType property.
     *
     * @return possible object is
     * {@link AclPortTypeEnum }
     */
    public AclPortTypeEnum getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     *
     * @param value allowed object is
     *              {@link AclPortTypeEnum }
     */
    public void setPortType(AclPortTypeEnum value) {
        this.portType = value;
    }

    /**
     * Gets the value of the protocol property.
     *
     * @return possible object is
     * {@link ProtocolTypeEnum }
     */
    public ProtocolTypeEnum getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     *
     * @param value allowed object is
     *              {@link ProtocolTypeEnum }
     */
    public void setProtocol(ProtocolTypeEnum value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the source property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link FirewallAclEndpointType }{@code >}
     */
    public JAXBElement<FirewallAclEndpointType> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link FirewallAclEndpointType }{@code >}
     */
    public void setSource(JAXBElement<FirewallAclEndpointType> value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link FirewallAclEndpointType }{@code >}
     */
    public JAXBElement<FirewallAclEndpointType> getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link FirewallAclEndpointType }{@code >}
     */
    public void setDestination(JAXBElement<FirewallAclEndpointType> value) {
        this.destination = value;
    }

    /**
     * Gets the value of the portRange property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link PortRangeType }{@code >}
     */
    public JAXBElement<PortRangeType> getPortRange() {
        return portRange;
    }

    /**
     * Sets the value of the portRange property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link PortRangeType }{@code >}
     */
    public void setPortRange(JAXBElement<PortRangeType> value) {
        this.portRange = value;
    }

    /**
     * Gets the value of the portRanges property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link PortRangesType }{@code >}
     */
    public JAXBElement<PortRangesType> getPortRanges() {
        return portRanges;
    }

    /**
     * Sets the value of the portRanges property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link PortRangesType }{@code >}
     */
    public void setPortRanges(JAXBElement<PortRangesType> value) {
        this.portRanges = value;
    }

}
