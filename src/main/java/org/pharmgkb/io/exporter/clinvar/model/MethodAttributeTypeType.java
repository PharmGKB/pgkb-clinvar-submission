//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.10.16 at 09:04:14 AM PDT
//


package org.pharmgkb.io.exporter.clinvar.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MethodAttributeTypeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MethodAttributeTypeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>typeMethodAttributeType">
 *       &lt;attribute name="val_type" use="required" type="{}typeIdName" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodAttributeTypeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    MethodAttributeType.AttributeType.class
})
public class MethodAttributeTypeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "val_type", required = true)
    protected TypeIdName valType;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valType property.
     *
     * @return
     *     possible object is
     *     {@link TypeIdName }
     *
     */
    public TypeIdName getValType() {
        return valType;
    }

    /**
     * Sets the value of the valType property.
     *
     * @param value
     *     allowed object is
     *     {@link TypeIdName }
     *
     */
    public void setValType(TypeIdName value) {
        this.valType = value;
    }

}
