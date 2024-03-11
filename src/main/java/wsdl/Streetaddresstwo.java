
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streetaddresstwo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="streetaddresstwo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="streetaddresstwoPK" type="{http://globalservice.ws.bept.ids.by/}streetaddresstwoPK" minOccurs="0"/>
 *         <element name="streetaddresstwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "streetaddresstwo", propOrder = {
    "streetaddresstwoPK",
    "streetaddresstwo",
    "party"
})
public class Streetaddresstwo {

    protected StreetaddresstwoPK streetaddresstwoPK;
    protected String streetaddresstwo;
    protected Party party;

    /**
     * Gets the value of the streetaddresstwoPK property.
     * 
     * @return
     *     possible object is
     *     {@link StreetaddresstwoPK }
     *     
     */
    public StreetaddresstwoPK getStreetaddresstwoPK() {
        return streetaddresstwoPK;
    }

    /**
     * Sets the value of the streetaddresstwoPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetaddresstwoPK }
     *     
     */
    public void setStreetaddresstwoPK(StreetaddresstwoPK value) {
        this.streetaddresstwoPK = value;
    }

    /**
     * Gets the value of the streetaddresstwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetaddresstwo() {
        return streetaddresstwo;
    }

    /**
     * Sets the value of the streetaddresstwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetaddresstwo(String value) {
        this.streetaddresstwo = value;
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
