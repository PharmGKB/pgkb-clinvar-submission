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
 * <p>Java class for Measuretype.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Measuretype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Gene"/>
 *     &lt;enumeration value="Variation"/>
 *     &lt;enumeration value="Insertion"/>
 *     &lt;enumeration value="Mobile element insertion"/>
 *     &lt;enumeration value="Novel sequence insertion"/>
 *     &lt;enumeration value="Microsatellite"/>
 *     &lt;enumeration value="Deletion"/>
 *     &lt;enumeration value="single nucleotide variant"/>
 *     &lt;enumeration value="Multiple nucleotide variation"/>
 *     &lt;enumeration value="Indel"/>
 *     &lt;enumeration value="Duplication"/>
 *     &lt;enumeration value="Tandem duplication"/>
 *     &lt;enumeration value="copy number loss"/>
 *     &lt;enumeration value="copy number gain"/>
 *     &lt;enumeration value="protein only"/>
 *     &lt;enumeration value="Inversion"/>
 *     &lt;enumeration value="Translocation"/>
 *     &lt;enumeration value="Interchromosomal breakpoint"/>
 *     &lt;enumeration value="Intrachromosomal breakpoint"/>
 *     &lt;enumeration value="Complex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "Measuretype")
@XmlEnum
public enum Measuretype {

    @XmlEnumValue("Gene")
    GENE("Gene"),
    @XmlEnumValue("Variation")
    VARIATION("Variation"),
    @XmlEnumValue("Insertion")
    INSERTION("Insertion"),
    @XmlEnumValue("Mobile element insertion")
    MOBILE_ELEMENT_INSERTION("Mobile element insertion"),
    @XmlEnumValue("Novel sequence insertion")
    NOVEL_SEQUENCE_INSERTION("Novel sequence insertion"),
    @XmlEnumValue("Microsatellite")
    MICROSATELLITE("Microsatellite"),
    @XmlEnumValue("Deletion")
    DELETION("Deletion"),
    @XmlEnumValue("single nucleotide variant")
    SINGLE_NUCLEOTIDE_VARIANT("single nucleotide variant"),
    @XmlEnumValue("Multiple nucleotide variation")
    MULTIPLE_NUCLEOTIDE_VARIATION("Multiple nucleotide variation"),
    @XmlEnumValue("Indel")
    INDEL("Indel"),
    @XmlEnumValue("Duplication")
    DUPLICATION("Duplication"),
    @XmlEnumValue("Tandem duplication")
    TANDEM_DUPLICATION("Tandem duplication"),
    @XmlEnumValue("copy number loss")
    COPY_NUMBER_LOSS("copy number loss"),
    @XmlEnumValue("copy number gain")
    COPY_NUMBER_GAIN("copy number gain"),
    @XmlEnumValue("protein only")
    PROTEIN_ONLY("protein only"),
    @XmlEnumValue("Inversion")
    INVERSION("Inversion"),
    @XmlEnumValue("Translocation")
    TRANSLOCATION("Translocation"),
    @XmlEnumValue("Interchromosomal breakpoint")
    INTERCHROMOSOMAL_BREAKPOINT("Interchromosomal breakpoint"),
    @XmlEnumValue("Intrachromosomal breakpoint")
    INTRACHROMOSOMAL_BREAKPOINT("Intrachromosomal breakpoint"),
    @XmlEnumValue("Complex")
    COMPLEX("Complex");
    private final String value;

    Measuretype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Measuretype fromValue(String v) {
        for (Measuretype c: Measuretype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
