
package com.example.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for client complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="client"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clienid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmoney" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", propOrder = {
    "clienid",
    "cmoney",
    "cpassword"
})
public class Client {

    protected String clienid;
    protected Integer cmoney;
    protected String cpassword;

    /**
     * Gets the value of the clienid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienid() {
        return clienid;
    }

    /**
     * Sets the value of the clienid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienid(String value) {
        this.clienid = value;
    }

    /**
     * Gets the value of the cmoney property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCmoney() {
        return cmoney;
    }

    /**
     * Sets the value of the cmoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCmoney(Integer value) {
        this.cmoney = value;
    }

    /**
     * Gets the value of the cpassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpassword() {
        return cpassword;
    }

    /**
     * Sets the value of the cpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpassword(String value) {
        this.cpassword = value;
    }

}
