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
 * <p>Java class for typeObsMethodAttributeTypelist.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeObsMethodAttributeTypelist">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MethodResult"/>
 *     &lt;enumeration value="TestingLaboratory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeObsMethodAttributeTypelist")
@XmlEnum
public enum TypeObsMethodAttributeTypelist {

    @XmlEnumValue("MethodResult")
    METHOD_RESULT("MethodResult"),
    @XmlEnumValue("TestingLaboratory")
    TESTING_LABORATORY("TestingLaboratory");
    private final String value;

    TypeObsMethodAttributeTypelist(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeObsMethodAttributeTypelist fromValue(String v) {
        for (TypeObsMethodAttributeTypelist c: TypeObsMethodAttributeTypelist.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
