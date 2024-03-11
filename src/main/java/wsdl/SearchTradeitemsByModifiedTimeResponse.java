
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchTradeitemsByModifiedTimeResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SearchTradeitemsByModifiedTimeResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://globalservice.ws.bept.ids.by/}searchTradeitemsByModifiedTimeResp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchTradeitemsByModifiedTimeResponse", propOrder = {
    "_return"
})
public class SearchTradeitemsByModifiedTimeResponse {

    @XmlElement(name = "return")
    protected SearchTradeitemsByModifiedTimeResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTradeitemsByModifiedTimeResp }
     *     
     */
    public SearchTradeitemsByModifiedTimeResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTradeitemsByModifiedTimeResp }
     *     
     */
    public void setReturn(SearchTradeitemsByModifiedTimeResp value) {
        this._return = value;
    }

}
