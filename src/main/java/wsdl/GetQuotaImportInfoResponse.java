
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getQuotaImportInfoResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getQuotaImportInfoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://globalservice.ws.bept.ids.by/}getQuotaImportInfoResp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuotaImportInfoResponse", propOrder = {
    "_return"
})
public class GetQuotaImportInfoResponse {

    @XmlElement(name = "return")
    protected GetQuotaImportInfoResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetQuotaImportInfoResp }
     *     
     */
    public GetQuotaImportInfoResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetQuotaImportInfoResp }
     *     
     */
    public void setReturn(GetQuotaImportInfoResp value) {
        this._return = value;
    }

}
