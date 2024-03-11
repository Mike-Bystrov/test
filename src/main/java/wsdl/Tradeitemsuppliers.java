
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemsuppliers complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="tradeitemsuppliers">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tradeitemsuppliersPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemsuppliersPK" minOccurs="0"/>
 *         <element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemsuppliers", propOrder = {
    "tradeitemsuppliersPK",
    "tradeitem"
})
public class Tradeitemsuppliers {

    protected TradeitemsuppliersPK tradeitemsuppliersPK;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the tradeitemsuppliersPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemsuppliersPK }
     *     
     */
    public TradeitemsuppliersPK getTradeitemsuppliersPK() {
        return tradeitemsuppliersPK;
    }

    /**
     * Sets the value of the tradeitemsuppliersPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemsuppliersPK }
     *     
     */
    public void setTradeitemsuppliersPK(TradeitemsuppliersPK value) {
        this.tradeitemsuppliersPK = value;
    }

    /**
     * Gets the value of the tradeitem property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitem }
     *     
     */
    public Tradeitem getTradeitem() {
        return tradeitem;
    }

    /**
     * Sets the value of the tradeitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitem }
     *     
     */
    public void setTradeitem(Tradeitem value) {
        this.tradeitem = value;
    }

}
