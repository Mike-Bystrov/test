
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemcountryofassembly complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="tradeitemcountryofassembly">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tradeitemcountryofassemblyPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemcountryofassemblyPK" minOccurs="0"/>
 *         <element name="tpneutraltiinformation" type="{http://globalservice.ws.bept.ids.by/}tpneutraltiinformation" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemcountryofassembly", propOrder = {
    "tradeitemcountryofassemblyPK",
    "tpneutraltiinformation"
})
public class Tradeitemcountryofassembly {

    protected TradeitemcountryofassemblyPK tradeitemcountryofassemblyPK;
    protected Tpneutraltiinformation tpneutraltiinformation;

    /**
     * Gets the value of the tradeitemcountryofassemblyPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemcountryofassemblyPK }
     *     
     */
    public TradeitemcountryofassemblyPK getTradeitemcountryofassemblyPK() {
        return tradeitemcountryofassemblyPK;
    }

    /**
     * Sets the value of the tradeitemcountryofassemblyPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemcountryofassemblyPK }
     *     
     */
    public void setTradeitemcountryofassemblyPK(TradeitemcountryofassemblyPK value) {
        this.tradeitemcountryofassemblyPK = value;
    }

    /**
     * Gets the value of the tpneutraltiinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Tpneutraltiinformation }
     *     
     */
    public Tpneutraltiinformation getTpneutraltiinformation() {
        return tpneutraltiinformation;
    }

    /**
     * Sets the value of the tpneutraltiinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tpneutraltiinformation }
     *     
     */
    public void setTpneutraltiinformation(Tpneutraltiinformation value) {
        this.tpneutraltiinformation = value;
    }

}
