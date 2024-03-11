
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactname complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="contactname">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="contactnamePK" type="{http://globalservice.ws.bept.ids.by/}contactnamePK" minOccurs="0"/>
 *         <element name="contactname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="party" type="{http://globalservice.ws.bept.ids.by/}party" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactname", propOrder = {
    "contactnamePK",
    "contactname",
    "party"
})
public class Contactname {

    protected ContactnamePK contactnamePK;
    protected String contactname;
    protected Party party;

    /**
     * Gets the value of the contactnamePK property.
     * 
     * @return
     *     possible object is
     *     {@link ContactnamePK }
     *     
     */
    public ContactnamePK getContactnamePK() {
        return contactnamePK;
    }

    /**
     * Sets the value of the contactnamePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactnamePK }
     *     
     */
    public void setContactnamePK(ContactnamePK value) {
        this.contactnamePK = value;
    }

    /**
     * Gets the value of the contactname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactname() {
        return contactname;
    }

    /**
     * Sets the value of the contactname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactname(String value) {
        this.contactname = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

}
