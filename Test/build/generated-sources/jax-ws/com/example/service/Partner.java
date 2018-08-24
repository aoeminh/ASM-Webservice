
package com.example.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partneraccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnermoney" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="partnerpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partner", propOrder = {
    "partneraccount",
    "partnerid",
    "partnermoney",
    "partnerpassword"
})
public class Partner {

    protected String partneraccount;
    protected String partnerid;
    protected Integer partnermoney;
    protected String partnerpassword;

    /**
     * Gets the value of the partneraccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartneraccount() {
        return partneraccount;
    }

    /**
     * Sets the value of the partneraccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartneraccount(String value) {
        this.partneraccount = value;
    }

    /**
     * Gets the value of the partnerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerid() {
        return partnerid;
    }

    /**
     * Sets the value of the partnerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerid(String value) {
        this.partnerid = value;
    }

    /**
     * Gets the value of the partnermoney property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartnermoney() {
        return partnermoney;
    }

    /**
     * Sets the value of the partnermoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartnermoney(Integer value) {
        this.partnermoney = value;
    }

    /**
     * Gets the value of the partnerpassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerpassword() {
        return partnerpassword;
    }

    /**
     * Sets the value of the partnerpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerpassword(String value) {
        this.partnerpassword = value;
    }

}
