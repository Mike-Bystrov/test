
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTradeitemsOfPoolByModifiedTime complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getTradeitemsOfPoolByModifiedTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="request" type="{http://globalservice.ws.bept.ids.by/}getTradeitemsOfPoolByModifiedTimeReq" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTradeitemsOfPoolByModifiedTime", propOrder = {
    "request"
})
public class GetTradeitemsOfPoolByModifiedTime {

    protected GetTradeitemsOfPoolByModifiedTimeReq request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetTradeitemsOfPoolByModifiedTimeReq }
     *     
     */
    public GetTradeitemsOfPoolByModifiedTimeReq getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTradeitemsOfPoolByModifiedTimeReq }
     *     
     */
    public void setRequest(GetTradeitemsOfPoolByModifiedTimeReq value) {
        this.request = value;
    }

}
