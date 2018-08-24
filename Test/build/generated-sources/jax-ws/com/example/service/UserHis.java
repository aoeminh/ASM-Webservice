
package com.example.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userHis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userHis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="clientid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userHis", propOrder = {
    "transname",
    "money",
    "fee",
    "clientid"
})
public class UserHis {

    protected String transname;
    protected int money;
    protected int fee;
    protected String clientid;

    /**
     * Gets the value of the transname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransname() {
        return transname;
    }

    /**
     * Sets the value of the transname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransname(String value) {
        this.transname = value;
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

    /**
     * Gets the value of the fee property.
     * 
     */
    public int getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     */
    public void setFee(int value) {
        this.fee = value;
    }

    /**
     * Gets the value of the clientid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientid() {
        return clientid;
    }

    /**
     * Sets the value of the clientid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientid(String value) {
        this.clientid = value;
    }

}
