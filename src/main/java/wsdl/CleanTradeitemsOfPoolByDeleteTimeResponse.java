
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cleanTradeitemsOfPoolByDeleteTimeResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="cleanTradeitemsOfPoolByDeleteTimeResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://globalservice.ws.bept.ids.by/}cleanTradeitemsOfPoolByDeleteTimeResp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cleanTradeitemsOfPoolByDeleteTimeResponse", propOrder = {
    "_return"
})
public class CleanTradeitemsOfPoolByDeleteTimeResponse {

    @XmlElement(name = "return")
    protected CleanTradeitemsOfPoolByDeleteTimeResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link CleanTradeitemsOfPoolByDeleteTimeResp }
     *     
     */
    public CleanTradeitemsOfPoolByDeleteTimeResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanTradeitemsOfPoolByDeleteTimeResp }
     *     
     */
    public void setReturn(CleanTradeitemsOfPoolByDeleteTimeResp value) {
        this._return = value;
    }

}
