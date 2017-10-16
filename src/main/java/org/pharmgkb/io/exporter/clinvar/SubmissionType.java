//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.16 at 09:04:14 AM PDT 
//


package org.pharmgkb.io.exporter.clinvar;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Each ClinVar submission is a single asserted relationship. There must
 *                 be at least 1 in a set, but there may be many. 
 * 
 * <p>Java class for SubmissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="novel"/>
 *               &lt;enumeration value="update"/>
 *               &lt;enumeration value="delete"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReleaseStatus" type="{}ReleaseStatusType" minOccurs="0"/>
 *         &lt;element name="ClinvarSubmissionID">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="submitter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="localKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="submittedAssembly" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="submitterDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="submitter_variant_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="localKeyIsSubmitted">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *                       &lt;enumeration value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClinvarSubmissionAcc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClinvarSubmissionAccType">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;>typeClinvarSubmissionAcc">
 *                           &lt;attribute name="val_type" use="required" type="{}typeIdName" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Acc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReplacesAccession" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeasureTrait" type="{}MeasureTraitType"/>
 *         &lt;choice>
 *           &lt;element name="MeasureSet" type="{}MeasureSetType"/>
 *           &lt;element name="GenotypeSet" type="{}GenotypeSetType"/>
 *         &lt;/choice>
 *         &lt;element name="TraitSet" type="{}TraitSetType"/>
 *         &lt;element name="XRef" type="{}XrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Citation" type="{}CitationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comment" type="{}CommentType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}CVIdentifiers"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmissionType", propOrder = {
    "recordStatus",
    "releaseStatus",
    "clinvarSubmissionID",
    "clinvarSubmissionAcc",
    "replacesAccession",
    "measureTrait",
    "measureSet",
    "genotypeSet",
    "traitSet",
    "xRef",
    "citation",
    "comment"
})
public class SubmissionType {

    @XmlElement(name = "RecordStatus")
    protected String recordStatus;
    @XmlElement(name = "ReleaseStatus", defaultValue = "public")
    @XmlSchemaType(name = "string")
    protected ReleaseStatusType releaseStatus;
    @XmlElement(name = "ClinvarSubmissionID", required = true)
    protected SubmissionType.ClinvarSubmissionID clinvarSubmissionID;
    @XmlElement(name = "ClinvarSubmissionAcc")
    protected SubmissionType.ClinvarSubmissionAcc clinvarSubmissionAcc;
    @XmlElement(name = "ReplacesAccession")
    protected List<String> replacesAccession;
    @XmlElement(name = "MeasureTrait", required = true)
    protected MeasureTraitType measureTrait;
    @XmlElement(name = "MeasureSet")
    protected MeasureSetType measureSet;
    @XmlElement(name = "GenotypeSet")
    protected GenotypeSetType genotypeSet;
    @XmlElement(name = "TraitSet", required = true)
    protected TraitSetType traitSet;
    @XmlElement(name = "XRef")
    protected List<XrefType> xRef;
    @XmlElement(name = "Citation")
    protected List<CitationType> citation;
    @XmlElement(name = "Comment")
    protected List<CommentType> comment;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlAttribute(name = "ncbi_id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ncbiId;

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordStatus(String value) {
        this.recordStatus = value;
    }

    /**
     * Gets the value of the releaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseStatusType }
     *     
     */
    public ReleaseStatusType getReleaseStatus() {
        return releaseStatus;
    }

    /**
     * Sets the value of the releaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseStatusType }
     *     
     */
    public void setReleaseStatus(ReleaseStatusType value) {
        this.releaseStatus = value;
    }

    /**
     * Gets the value of the clinvarSubmissionID property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionType.ClinvarSubmissionID }
     *     
     */
    public SubmissionType.ClinvarSubmissionID getClinvarSubmissionID() {
        return clinvarSubmissionID;
    }

    /**
     * Sets the value of the clinvarSubmissionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionType.ClinvarSubmissionID }
     *     
     */
    public void setClinvarSubmissionID(SubmissionType.ClinvarSubmissionID value) {
        this.clinvarSubmissionID = value;
    }

    /**
     * Gets the value of the clinvarSubmissionAcc property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionType.ClinvarSubmissionAcc }
     *     
     */
    public SubmissionType.ClinvarSubmissionAcc getClinvarSubmissionAcc() {
        return clinvarSubmissionAcc;
    }

    /**
     * Sets the value of the clinvarSubmissionAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionType.ClinvarSubmissionAcc }
     *     
     */
    public void setClinvarSubmissionAcc(SubmissionType.ClinvarSubmissionAcc value) {
        this.clinvarSubmissionAcc = value;
    }

    /**
     * Gets the value of the replacesAccession property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacesAccession property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacesAccession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReplacesAccession() {
        if (replacesAccession == null) {
            replacesAccession = new ArrayList<String>();
        }
        return this.replacesAccession;
    }

    /**
     * Gets the value of the measureTrait property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureTraitType }
     *     
     */
    public MeasureTraitType getMeasureTrait() {
        return measureTrait;
    }

    /**
     * Sets the value of the measureTrait property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureTraitType }
     *     
     */
    public void setMeasureTrait(MeasureTraitType value) {
        this.measureTrait = value;
    }

    /**
     * Gets the value of the measureSet property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureSetType }
     *     
     */
    public MeasureSetType getMeasureSet() {
        return measureSet;
    }

    /**
     * Sets the value of the measureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureSetType }
     *     
     */
    public void setMeasureSet(MeasureSetType value) {
        this.measureSet = value;
    }

    /**
     * Gets the value of the genotypeSet property.
     * 
     * @return
     *     possible object is
     *     {@link GenotypeSetType }
     *     
     */
    public GenotypeSetType getGenotypeSet() {
        return genotypeSet;
    }

    /**
     * Sets the value of the genotypeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenotypeSetType }
     *     
     */
    public void setGenotypeSet(GenotypeSetType value) {
        this.genotypeSet = value;
    }

    /**
     * Gets the value of the traitSet property.
     * 
     * @return
     *     possible object is
     *     {@link TraitSetType }
     *     
     */
    public TraitSetType getTraitSet() {
        return traitSet;
    }

    /**
     * Sets the value of the traitSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraitSetType }
     *     
     */
    public void setTraitSet(TraitSetType value) {
        this.traitSet = value;
    }

    /**
     * Gets the value of the xRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XrefType }
     * 
     * 
     */
    public List<XrefType> getXRef() {
        if (xRef == null) {
            xRef = new ArrayList<XrefType>();
        }
        return this.xRef;
    }

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationType }
     * 
     * 
     */
    public List<CitationType> getCitation() {
        if (citation == null) {
            citation = new ArrayList<CitationType>();
        }
        return this.citation;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the ncbiId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNcbiId() {
        return ncbiId;
    }

    /**
     * Sets the value of the ncbiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNcbiId(BigInteger value) {
        this.ncbiId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClinvarSubmissionAccType">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;>typeClinvarSubmissionAcc">
     *                 &lt;attribute name="val_type" use="required" type="{}typeIdName" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Acc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clinvarSubmissionAccType"
    })
    public static class ClinvarSubmissionAcc {

        @XmlElement(name = "ClinvarSubmissionAccType", required = true)
        protected SubmissionType.ClinvarSubmissionAcc.ClinvarSubmissionAccType clinvarSubmissionAccType;
        @XmlAttribute(name = "Acc", required = true)
        protected String acc;

        /**
         * Gets the value of the clinvarSubmissionAccType property.
         * 
         * @return
         *     possible object is
         *     {@link SubmissionType.ClinvarSubmissionAcc.ClinvarSubmissionAccType }
         *     
         */
        public SubmissionType.ClinvarSubmissionAcc.ClinvarSubmissionAccType getClinvarSubmissionAccType() {
            return clinvarSubmissionAccType;
        }

        /**
         * Sets the value of the clinvarSubmissionAccType property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubmissionType.ClinvarSubmissionAcc.ClinvarSubmissionAccType }
         *     
         */
        public void setClinvarSubmissionAccType(SubmissionType.ClinvarSubmissionAcc.ClinvarSubmissionAccType value) {
            this.clinvarSubmissionAccType = value;
        }

        /**
         * Gets the value of the acc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcc() {
            return acc;
        }

        /**
         * Sets the value of the acc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcc(String value) {
            this.acc = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;>typeClinvarSubmissionAcc">
         *       &lt;attribute name="val_type" use="required" type="{}typeIdName" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ClinvarSubmissionAccType {

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="submitter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="localKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="submittedAssembly" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="submitterDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="submitter_variant_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="localKeyIsSubmitted">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
     *             &lt;enumeration value="1"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ClinvarSubmissionID {

        @XmlAttribute(name = "submitter")
        protected String submitter;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "localKey", required = true)
        protected String localKey;
        @XmlAttribute(name = "submittedAssembly")
        protected String submittedAssembly;
        @XmlAttribute(name = "submitterDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar submitterDate;
        @XmlAttribute(name = "submitter_variant_id")
        protected String submitterVariantId;
        @XmlAttribute(name = "localKeyIsSubmitted")
        protected Long localKeyIsSubmitted;

        /**
         * Gets the value of the submitter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubmitter() {
            return submitter;
        }

        /**
         * Sets the value of the submitter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubmitter(String value) {
            this.submitter = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the localKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalKey() {
            return localKey;
        }

        /**
         * Sets the value of the localKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalKey(String value) {
            this.localKey = value;
        }

        /**
         * Gets the value of the submittedAssembly property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubmittedAssembly() {
            return submittedAssembly;
        }

        /**
         * Sets the value of the submittedAssembly property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubmittedAssembly(String value) {
            this.submittedAssembly = value;
        }

        /**
         * Gets the value of the submitterDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSubmitterDate() {
            return submitterDate;
        }

        /**
         * Sets the value of the submitterDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSubmitterDate(XMLGregorianCalendar value) {
            this.submitterDate = value;
        }

        /**
         * Gets the value of the submitterVariantId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubmitterVariantId() {
            return submitterVariantId;
        }

        /**
         * Sets the value of the submitterVariantId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubmitterVariantId(String value) {
            this.submitterVariantId = value;
        }

        /**
         * Gets the value of the localKeyIsSubmitted property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getLocalKeyIsSubmitted() {
            return localKeyIsSubmitted;
        }

        /**
         * Sets the value of the localKeyIsSubmitted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setLocalKeyIsSubmitted(Long value) {
            this.localKeyIsSubmitted = value;
        }

    }

}
