
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchSimpleTradeitemsByModifiedTime2Response complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SearchSimpleTradeitemsByModifiedTime2Response">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://globalservice.ws.bept.ids.by/}searchSimpleTradeitemsByModifiedTimeResp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSimpleTradeitemsByModifiedTime2Response", propOrder = {
    "_return"
})
public class SearchSimpleTradeitemsByModifiedTime2Response {

    @XmlElement(name = "return")
    protected SearchSimpleTradeitemsByModifiedTimeResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSimpleTradeitemsByModifiedTimeResp }
     *     
     */
    public SearchSimpleTradeitemsByModifiedTimeResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSimpleTradeitemsByModifiedTimeResp }
     *     
     */
    public void setReturn(SearchSimpleTradeitemsByModifiedTimeResp value) {
        this._return = value;
    }

}
