
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemcountryoforigin complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="tradeitemcountryoforigin">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tradeitemcountryoforiginPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemcountryoforiginPK" minOccurs="0"/>
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
@XmlType(name = "tradeitemcountryoforigin", propOrder = {
    "tradeitemcountryoforiginPK",
    "tpneutraltiinformation"
})
public class Tradeitemcountryoforigin {

    protected TradeitemcountryoforiginPK tradeitemcountryoforiginPK;
    protected Tpneutraltiinformation tpneutraltiinformation;

    /**
     * Gets the value of the tradeitemcountryoforiginPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemcountryoforiginPK }
     *     
     */
    public TradeitemcountryoforiginPK getTradeitemcountryoforiginPK() {
        return tradeitemcountryoforiginPK;
    }

    /**
     * Sets the value of the tradeitemcountryoforiginPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemcountryoforiginPK }
     *     
     */
    public void setTradeitemcountryoforiginPK(TradeitemcountryoforiginPK value) {
        this.tradeitemcountryoforiginPK = value;
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
