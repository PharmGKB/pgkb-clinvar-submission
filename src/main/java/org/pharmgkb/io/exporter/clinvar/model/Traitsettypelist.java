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
 * <p>Java class for Traitsettypelist.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Traitsettypelist">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disease"/>
 *     &lt;enumeration value="DrugResponse"/>
 *     &lt;enumeration value="Finding"/>
 *     &lt;enumeration value="PhenotypeInstruction"/>
 *     &lt;enumeration value="TraitChoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "Traitsettypelist")
@XmlEnum
public enum Traitsettypelist {

    @XmlEnumValue("Disease")
    DISEASE("Disease"),
    @XmlEnumValue("DrugResponse")
    DRUG_RESPONSE("DrugResponse"),
    @XmlEnumValue("Finding")
    FINDING("Finding"),
    @XmlEnumValue("PhenotypeInstruction")
    PHENOTYPE_INSTRUCTION("PhenotypeInstruction"),
    @XmlEnumValue("TraitChoice")
    TRAIT_CHOICE("TraitChoice");
    private final String value;

    Traitsettypelist(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Traitsettypelist fromValue(String v) {
        for (Traitsettypelist c: Traitsettypelist.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
