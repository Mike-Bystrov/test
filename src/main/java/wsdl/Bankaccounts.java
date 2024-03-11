
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for bankaccounts complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="bankaccounts">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="accountid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="bankid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="accountnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accountname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="iban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="banksCollection" type="{http://globalservice.ws.bept.ids.by/}banks" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="gln" type="{http://globalservice.ws.bept.ids.by/}party" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankaccounts", propOrder = {
    "accountid",
    "bankid",
    "accountnumber",
    "accountname",
    "iban",
    "banksCollection",
    "gln"
})
public class Bankaccounts {

    protected BigDecimal accountid;
    protected BigInteger bankid;
    protected String accountnumber;
    protected String accountname;
    protected String iban;
    @XmlElement(nillable = true)
    protected List<Banks> banksCollection;
    protected Party gln;

    /**
     * Gets the value of the accountid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountid() {
        return accountid;
    }

    /**
     * Sets the value of the accountid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountid(BigDecimal value) {
        this.accountid = value;
    }

    /**
     * Gets the value of the bankid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBankid() {
        return bankid;
    }

    /**
     * Sets the value of the bankid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBankid(BigInteger value) {
        this.bankid = value;
    }

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountnumber() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountnumber(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the accountname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * Sets the value of the accountname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountname(String value) {
        this.accountname = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the banksCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the banksCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBanksCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Banks }
     * </p>
     * 
     * 
     * @return
     *     The value of the banksCollection property.
     */
    public List<Banks> getBanksCollection() {
        if (banksCollection == null) {
            banksCollection = new ArrayList<>();
        }
        return this.banksCollection;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setGln(Party value) {
        this.gln = value;
    }

}
