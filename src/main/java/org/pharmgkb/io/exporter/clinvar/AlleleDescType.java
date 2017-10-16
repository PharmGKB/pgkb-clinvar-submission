//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.16 at 09:04:14 AM PDT 
//


package org.pharmgkb.io.exporter.clinvar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is to be used within co-occurrence set 
 * 
 * <p>Java class for AlleleDescType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlleleDescType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RelativeOrientation" type="{}OrientationType" minOccurs="0"/>
 *         &lt;element name="Zygosity" type="{}ZygosityType" minOccurs="0"/>
 *         &lt;element name="ClinicalSignificance" type="{}ClinicalSignificanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cv_id" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlleleDescType", propOrder = {
    "name",
    "relativeOrientation",
    "zygosity",
    "clinicalSignificance"
})
public class AlleleDescType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "RelativeOrientation")
    @XmlSchemaType(name = "string")
    protected OrientationType relativeOrientation;
    @XmlElement(name = "Zygosity")
    @XmlSchemaType(name = "string")
    protected ZygosityType zygosity;
    @XmlElement(name = "ClinicalSignificance")
    protected ClinicalSignificanceType clinicalSignificance;
    @XmlAttribute(name = "cv_id")
    protected Integer cvId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relativeOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link OrientationType }
     *     
     */
    public OrientationType getRelativeOrientation() {
        return relativeOrientation;
    }

    /**
     * Sets the value of the relativeOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationType }
     *     
     */
    public void setRelativeOrientation(OrientationType value) {
        this.relativeOrientation = value;
    }

    /**
     * Gets the value of the zygosity property.
     * 
     * @return
     *     possible object is
     *     {@link ZygosityType }
     *     
     */
    public ZygosityType getZygosity() {
        return zygosity;
    }

    /**
     * Sets the value of the zygosity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZygosityType }
     *     
     */
    public void setZygosity(ZygosityType value) {
        this.zygosity = value;
    }

    /**
     * Gets the value of the clinicalSignificance property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalSignificanceType }
     *     
     */
    public ClinicalSignificanceType getClinicalSignificance() {
        return clinicalSignificance;
    }

    /**
     * Sets the value of the clinicalSignificance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalSignificanceType }
     *     
     */
    public void setClinicalSignificance(ClinicalSignificanceType value) {
        this.clinicalSignificance = value;
    }

    /**
     * Gets the value of the cvId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCvId() {
        if (cvId == null) {
            return  0;
        } else {
            return cvId;
        }
    }

    /**
     * Sets the value of the cvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCvId(Integer value) {
        this.cvId = value;
    }

}