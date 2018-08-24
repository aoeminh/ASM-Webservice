
package com.example.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for partnerhistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partnerhistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tpartnerid" type="{http://service.example.com/}partner" minOccurs="0"/&gt;
 *         &lt;element name="transfee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="transmoney" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="transname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partnerhistory", propOrder = {
    "tdate",
    "tpartnerid",
    "transfee",
    "transid",
    "transmoney",
    "transname"
})
public class Partnerhistory {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tdate;
    protected Partner tpartnerid;
    protected Double transfee;
    protected Integer transid;
    protected Double transmoney;
    protected String transname;

    /**
     * Gets the value of the tdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTdate() {
        return tdate;
    }

    /**
     * Sets the value of the tdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTdate(XMLGregorianCalendar value) {
        this.tdate = value;
    }

    /**
     * Gets the value of the tpartnerid property.
     * 
     * @return
     *     possible object is
     *     {@link Partner }
     *     
     */
    public Partner getTpartnerid() {
        return tpartnerid;
    }

    /**
     * Sets the value of the tpartnerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partner }
     *     
     */
    public void setTpartnerid(Partner value) {
        this.tpartnerid = value;
    }

    /**
     * Gets the value of the transfee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransfee() {
        return transfee;
    }

    /**
     * Sets the value of the transfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransfee(Double value) {
        this.transfee = value;
    }

    /**
     * Gets the value of the transid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransid() {
        return transid;
    }

    /**
     * Sets the value of the transid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransid(Integer value) {
        this.transid = value;
    }

    /**
     * Gets the value of the transmoney property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransmoney() {
        return transmoney;
    }

    /**
     * Sets the value of the transmoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransmoney(Double value) {
        this.transmoney = value;
    }

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

}
