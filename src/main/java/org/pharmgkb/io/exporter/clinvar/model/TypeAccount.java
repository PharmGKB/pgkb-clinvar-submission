//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.10.16 at 09:04:14 AM PDT
//


package org.pharmgkb.io.exporter.clinvar.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Account - a person with logon
 *
 * <p>Java class for typeAccount complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="typeAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{}typeContactInfo"/>
 *       &lt;/sequence>
 *       &lt;attribute name="user_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="authority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GTRPersonId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAccount", propOrder = {
    "contact"
})
public class TypeAccount {

    @XmlElement(name = "Contact", required = true)
    protected TypeContactInfo contact;
    @XmlAttribute(name = "user_name")
    protected String userName;
    @XmlAttribute(name = "authority")
    protected String authority;
    @XmlAttribute(name = "GTRPersonId")
    protected Integer gtrPersonId;

    /**
     * Gets the value of the contact property.
     *
     * @return
     *     possible object is
     *     {@link TypeContactInfo }
     *
     */
    public TypeContactInfo getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     *
     * @param value
     *     allowed object is
     *     {@link TypeContactInfo }
     *
     */
    public void setContact(TypeContactInfo value) {
        this.contact = value;
    }

    /**
     * Gets the value of the userName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the authority property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Gets the value of the gtrPersonId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getGTRPersonId() {
        return gtrPersonId;
    }

    /**
     * Sets the value of the gtrPersonId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setGTRPersonId(Integer value) {
        this.gtrPersonId = value;
    }

}
