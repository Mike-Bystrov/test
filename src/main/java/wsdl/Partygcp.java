
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partygcp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="partygcp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="partygcpPK" type="{http://globalservice.ws.bept.ids.by/}partygcpPK" minOccurs="0"/>
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
@XmlType(name = "partygcp", propOrder = {
    "partygcpPK",
    "party"
})
public class Partygcp {

    protected PartygcpPK partygcpPK;
    protected Party party;

    /**
     * Gets the value of the partygcpPK property.
     * 
     * @return
     *     possible object is
     *     {@link PartygcpPK }
     *     
     */
    public PartygcpPK getPartygcpPK() {
        return partygcpPK;
    }

    /**
     * Sets the value of the partygcpPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartygcpPK }
     *     
     */
    public void setPartygcpPK(PartygcpPK value) {
        this.partygcpPK = value;
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
