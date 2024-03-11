
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cleanTradeitemsOfPoolByDeleteTime complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="cleanTradeitemsOfPoolByDeleteTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="request" type="{http://globalservice.ws.bept.ids.by/}cleanTradeitemsOfPoolByDeleteTimeReq" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cleanTradeitemsOfPoolByDeleteTime", propOrder = {
    "request"
})
public class CleanTradeitemsOfPoolByDeleteTime {

    protected CleanTradeitemsOfPoolByDeleteTimeReq request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CleanTradeitemsOfPoolByDeleteTimeReq }
     *     
     */
    public CleanTradeitemsOfPoolByDeleteTimeReq getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanTradeitemsOfPoolByDeleteTimeReq }
     *     
     */
    public void setRequest(CleanTradeitemsOfPoolByDeleteTimeReq value) {
        this.request = value;
    }

}
