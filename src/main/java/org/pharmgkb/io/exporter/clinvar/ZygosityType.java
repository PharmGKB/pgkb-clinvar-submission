//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.16 at 09:04:14 AM PDT 
//


package org.pharmgkb.io.exporter.clinvar;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZygosityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZygosityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Homozygote"/>
 *     &lt;enumeration value="Single heterozygote"/>
 *     &lt;enumeration value="Compound heterozygote"/>
 *     &lt;enumeration value="Hemizygote"/>
 *     &lt;enumeration value="not provided"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZygosityType")
@XmlEnum
public enum ZygosityType {

    @XmlEnumValue("Homozygote")
    HOMOZYGOTE("Homozygote"),
    @XmlEnumValue("Single heterozygote")
    SINGLE_HETEROZYGOTE("Single heterozygote"),
    @XmlEnumValue("Compound heterozygote")
    COMPOUND_HETEROZYGOTE("Compound heterozygote"),
    @XmlEnumValue("Hemizygote")
    HEMIZYGOTE("Hemizygote"),
    @XmlEnumValue("not provided")
    NOT_PROVIDED("not provided");
    private final String value;

    ZygosityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZygosityType fromValue(String v) {
        for (ZygosityType c: ZygosityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}