//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.16 at 09:04:14 AM PDT 
//


package org.pharmgkb.io.exporter.clinvar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeType">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>MethodAttributeTypeType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attribute" type="{}AttributeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodAttributeType", propOrder = {
    "attributeType",
    "attribute"
})
public class MethodAttributeType {

    @XmlElement(name = "AttributeType", required = true)
    protected MethodAttributeType.AttributeType attributeType;
    @XmlElement(name = "Attribute", required = true)
    protected org.pharmgkb.io.exporter.clinvar.AttributeType attribute;

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link MethodAttributeType.AttributeType }
     *     
     */
    public MethodAttributeType.AttributeType getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodAttributeType.AttributeType }
     *     
     */
    public void setAttributeType(MethodAttributeType.AttributeType value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link org.pharmgkb.io.exporter.clinvar.AttributeType }
     *     
     */
    public org.pharmgkb.io.exporter.clinvar.AttributeType getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.pharmgkb.io.exporter.clinvar.AttributeType }
     *     
     */
    public void setAttribute(org.pharmgkb.io.exporter.clinvar.AttributeType value) {
        this.attribute = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>MethodAttributeTypeType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AttributeType
        extends MethodAttributeTypeType
    {


    }

}