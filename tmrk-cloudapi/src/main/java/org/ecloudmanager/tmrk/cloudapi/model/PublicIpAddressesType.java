//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.16 at 03:24:22 PM EEST 
//


package org.ecloudmanager.tmrk.cloudapi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicIpAddressesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicIpAddressesType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PublicIpAddressReferencesResourceType">
 *       &lt;sequence>
 *         &lt;element name="RemainingExternal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemainingInternal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicIpAddressesType", propOrder = {
    "remainingExternal",
    "remainingInternal"
})
public class PublicIpAddressesType
    extends PublicIpAddressReferencesResourceType
{

    @XmlElement(name = "RemainingExternal")
    protected Integer remainingExternal;
    @XmlElement(name = "RemainingInternal")
    protected Integer remainingInternal;

    /**
     * Gets the value of the remainingExternal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingExternal() {
        return remainingExternal;
    }

    /**
     * Sets the value of the remainingExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingExternal(Integer value) {
        this.remainingExternal = value;
    }

    /**
     * Gets the value of the remainingInternal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingInternal() {
        return remainingInternal;
    }

    /**
     * Sets the value of the remainingInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingInternal(Integer value) {
        this.remainingInternal = value;
    }

}
