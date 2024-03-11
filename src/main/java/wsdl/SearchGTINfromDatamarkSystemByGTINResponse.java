
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchGTINfromDatamarkSystemByGTINResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SearchGTINfromDatamarkSystemByGTINResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://globalservice.ws.bept.ids.by/}searchGTINfromDatamarkSystemByGTINResp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGTINfromDatamarkSystemByGTINResponse", propOrder = {
    "_return"
})
public class SearchGTINfromDatamarkSystemByGTINResponse {

    @XmlElement(name = "return")
    protected SearchGTINfromDatamarkSystemByGTINResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SearchGTINfromDatamarkSystemByGTINResp }
     *     
     */
    public SearchGTINfromDatamarkSystemByGTINResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchGTINfromDatamarkSystemByGTINResp }
     *     
     */
    public void setReturn(SearchGTINfromDatamarkSystemByGTINResp value) {
        this._return = value;
    }

}
