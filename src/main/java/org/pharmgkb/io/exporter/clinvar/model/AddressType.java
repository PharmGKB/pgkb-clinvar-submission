//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.10.16 at 09:04:14 AM PDT
//


package org.pharmgkb.io.exporter.clinvar.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AddressType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="State" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{}CVIdentifiers"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{}CVIdentifiers"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}CVIdentifiers"/>
 *       &lt;attribute name="Public" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "line1",
    "line2",
    "line3",
    "city",
    "state",
    "postCode",
    "country"
})
public class AddressType {

    @XmlElement(name = "Line1")
    protected String line1;
    @XmlElement(name = "Line2")
    protected String line2;
    @XmlElement(name = "Line3")
    protected String line3;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "State")
    protected AddressType.State state;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "Country", required = true)
    protected AddressType.Country country;
    @XmlAttribute(name = "Public", required = true)
    protected boolean _public;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlAttribute(name = "ncbi_id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ncbiId;

    /**
     * Gets the value of the line1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link AddressType.State }
     *
     */
    public AddressType.State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressType.State }
     *
     */
    public void setState(AddressType.State value) {
        this.state = value;
    }

    /**
     * Gets the value of the postCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link AddressType.Country }
     *
     */
    public AddressType.Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressType.Country }
     *
     */
    public void setCountry(AddressType.Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the public property.
     *
     */
    public boolean isPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     *
     */
    public void setPublic(boolean value) {
        this._public = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{}CVIdentifiers"/>
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
    public static class Country {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "id")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;
        @XmlAttribute(name = "ncbi_id")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger ncbiId;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{}CVIdentifiers"/>
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
    public static class State {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "id")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;
        @XmlAttribute(name = "ncbi_id")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger ncbiId;

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

    }

}