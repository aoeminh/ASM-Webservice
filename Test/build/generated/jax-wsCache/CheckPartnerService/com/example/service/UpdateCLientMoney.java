
package com.example.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCLientMoney complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateCLientMoney"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clienid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCLientMoney", propOrder = {
    "clienid",
    "money"
})
public class UpdateCLientMoney {

    protected String clienid;
    protected int money;

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
     * Gets the value of the money property.
     * 
     */
    public int getMoney() {
        return money;
    }

    /**
     * Sets the value of the money property.
     * 
     */
    public void setMoney(int value) {
        this.money = value;
    }

}
