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
 * <p>Java class for MeasuresetAttributetype.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasuresetAttributetype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="HGVS"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="FunctionalConsequence"/>
 *     &lt;enumeration value="MolecularConsequence"/>
 *     &lt;enumeration value="ISCNCoordinates"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MeasuresetAttributetype")
@XmlEnum
public enum MeasuresetAttributetype {

    @XmlEnumValue("Location")
    LOCATION("Location"),
    HGVS("HGVS"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("FunctionalConsequence")
    FUNCTIONAL_CONSEQUENCE("FunctionalConsequence"),
    @XmlEnumValue("MolecularConsequence")
    MOLECULAR_CONSEQUENCE("MolecularConsequence"),
    @XmlEnumValue("ISCNCoordinates")
    ISCN_COORDINATES("ISCNCoordinates");
    private final String value;

    MeasuresetAttributetype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasuresetAttributetype fromValue(String v) {
        for (MeasuresetAttributetype c: MeasuresetAttributetype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}