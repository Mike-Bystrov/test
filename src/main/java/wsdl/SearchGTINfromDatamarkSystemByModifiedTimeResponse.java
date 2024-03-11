
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchGTINfromDatamarkSystemByModifiedTimeResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SearchGTINfromDatamarkSystemByModifiedTimeResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://globalservice.ws.bept.ids.by/}searchSimpleImportTradeitemsByModifiedTimeResp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGTINfromDatamarkSystemByModifiedTimeResponse", propOrder = {
    "_return"
})
public class SearchGTINfromDatamarkSystemByModifiedTimeResponse {

    @XmlElement(name = "return")
    protected SearchSimpleImportTradeitemsByModifiedTimeResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSimpleImportTradeitemsByModifiedTimeResp }
     *     
     */
    public SearchSimpleImportTradeitemsByModifiedTimeResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSimpleImportTradeitemsByModifiedTimeResp }
     *     
     */
    public void setReturn(SearchSimpleImportTradeitemsByModifiedTimeResp value) {
        this._return = value;
    }

}
