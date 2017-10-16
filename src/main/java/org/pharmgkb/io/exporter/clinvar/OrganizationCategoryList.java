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
 * <p>Java class for OrganizationCategoryList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationCategoryList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lab"/>
 *     &lt;enumeration value="LSDB"/>
 *     &lt;enumeration value="clinic"/>
 *     &lt;enumeration value="resource"/>
 *     &lt;enumeration value="consortium"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationCategoryList")
@XmlEnum
public enum OrganizationCategoryList {

    @XmlEnumValue("lab")
    LAB("lab"),
    LSDB("LSDB"),
    @XmlEnumValue("clinic")
    CLINIC("clinic"),
    @XmlEnumValue("resource")
    RESOURCE("resource"),
    @XmlEnumValue("consortium")
    CONSORTIUM("consortium"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OrganizationCategoryList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganizationCategoryList fromValue(String v) {
        for (OrganizationCategoryList c: OrganizationCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}