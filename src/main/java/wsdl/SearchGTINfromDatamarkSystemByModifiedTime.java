
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchGTINfromDatamarkSystemByModifiedTime complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SearchGTINfromDatamarkSystemByModifiedTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="request" type="{http://globalservice.ws.bept.ids.by/}searchSimpleImportTradeitemsByModifiedTimeReq" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGTINfromDatamarkSystemByModifiedTime", propOrder = {
    "request"
})
public class SearchGTINfromDatamarkSystemByModifiedTime {

    protected SearchSimpleImportTradeitemsByModifiedTimeReq request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSimpleImportTradeitemsByModifiedTimeReq }
     *     
     */
    public SearchSimpleImportTradeitemsByModifiedTimeReq getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSimpleImportTradeitemsByModifiedTimeReq }
     *     
     */
    public void setRequest(SearchSimpleImportTradeitemsByModifiedTimeReq value) {
        this.request = value;
    }

}
