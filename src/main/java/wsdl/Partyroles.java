
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyroles complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="partyroles">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="partyrolesPK" type="{http://globalservice.ws.bept.ids.by/}partyrolesPK" minOccurs="0"/>
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
@XmlType(name = "partyroles", propOrder = {
    "partyrolesPK",
    "party"
})
public class Partyroles {

    protected PartyrolesPK partyrolesPK;
    protected Party party;

    /**
     * Gets the value of the partyrolesPK property.
     * 
     * @return
     *     possible object is
     *     {@link PartyrolesPK }
     *     
     */
    public PartyrolesPK getPartyrolesPK() {
        return partyrolesPK;
    }

    /**
     * Sets the value of the partyrolesPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyrolesPK }
     *     
     */
    public void setPartyrolesPK(PartyrolesPK value) {
        this.partyrolesPK = value;
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
