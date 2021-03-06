//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.10.16 at 09:04:14 AM PDT
//


package org.pharmgkb.io.exporter.clinvar.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMethodAttributeTypelist.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMethodAttributeTypelist">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ControlsAppropriate"/>
 *     &lt;enumeration value="MethodAppropriate"/>
 *     &lt;enumeration value="TestName"/>
 *     &lt;enumeration value="StructVarMethodType"/>
 *     &lt;enumeration value="ProbeAccession"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "typeMethodAttributeTypelist")
@XmlEnum
public enum TypeMethodAttributeTypelist {

    @XmlEnumValue("ControlsAppropriate")
    CONTROLS_APPROPRIATE("ControlsAppropriate"),
    @XmlEnumValue("MethodAppropriate")
    METHOD_APPROPRIATE("MethodAppropriate"),
    @XmlEnumValue("TestName")
    TEST_NAME("TestName"),
    @XmlEnumValue("StructVarMethodType")
    STRUCT_VAR_METHOD_TYPE("StructVarMethodType"),
    @XmlEnumValue("ProbeAccession")
    PROBE_ACCESSION("ProbeAccession");
    private final String value;

    TypeMethodAttributeTypelist(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMethodAttributeTypelist fromValue(String v) {
        for (TypeMethodAttributeTypelist c: TypeMethodAttributeTypelist.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
