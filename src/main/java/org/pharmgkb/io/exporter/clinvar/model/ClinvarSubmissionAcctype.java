//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.10.16 at 09:04:14 AM PDT
//


package org.pharmgkb.io.exporter.clinvar.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClinvarSubmissionAcctype.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClinvarSubmissionAcctype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCV"/>
 *     &lt;enumeration value="RCV"/>
 *     &lt;enumeration value="NCV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ClinvarSubmissionAcctype")
@XmlEnum
public enum ClinvarSubmissionAcctype {

    SCV,
    RCV,
    NCV;

    public String value() {
        return name();
    }

    public static ClinvarSubmissionAcctype fromValue(String v) {
        return valueOf(v);
    }

}
