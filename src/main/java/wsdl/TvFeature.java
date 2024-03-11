
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tvFeature complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="tvFeature">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tvFeaturePK" type="{http://globalservice.ws.bept.ids.by/}tvFeaturePK" minOccurs="0"/>
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
@XmlType(name = "tvFeature", propOrder = {
    "tvFeaturePK",
    "tradeitem"
})
public class TvFeature {

    protected TvFeaturePK tvFeaturePK;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the tvFeaturePK property.
     * 
     * @return
     *     possible object is
     *     {@link TvFeaturePK }
     *     
     */
    public TvFeaturePK getTvFeaturePK() {
        return tvFeaturePK;
    }

    /**
     * Sets the value of the tvFeaturePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TvFeaturePK }
     *     
     */
    public void setTvFeaturePK(TvFeaturePK value) {
        this.tvFeaturePK = value;
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
