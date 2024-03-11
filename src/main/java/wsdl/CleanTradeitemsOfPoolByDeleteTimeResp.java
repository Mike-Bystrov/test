
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cleanTradeitemsOfPoolByDeleteTimeResp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="cleanTradeitemsOfPoolByDeleteTimeResp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}cleanTradeitemsOfPoolByDeleteTimeEnum" minOccurs="0"/>
 *         <element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/>
 *         <element name="recordsDeleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cleanTradeitemsOfPoolByDeleteTimeResp", propOrder = {
    "errorCode",
    "header",
    "recordsDeleted"
})
public class CleanTradeitemsOfPoolByDeleteTimeResp {

    @XmlSchemaType(name = "string")
    protected CleanTradeitemsOfPoolByDeleteTimeEnum errorCode;
    protected ApiHeaderResponse header;
    protected int recordsDeleted;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CleanTradeitemsOfPoolByDeleteTimeEnum }
     *     
     */
    public CleanTradeitemsOfPoolByDeleteTimeEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanTradeitemsOfPoolByDeleteTimeEnum }
     *     
     */
    public void setErrorCode(CleanTradeitemsOfPoolByDeleteTimeEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ApiHeaderResponse }
     *     
     */
    public ApiHeaderResponse getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiHeaderResponse }
     *     
     */
    public void setHeader(ApiHeaderResponse value) {
        this.header = value;
    }

    /**
     * Gets the value of the recordsDeleted property.
     * 
     */
    public int getRecordsDeleted() {
        return recordsDeleted;
    }

    /**
     * Sets the value of the recordsDeleted property.
     * 
     */
    public void setRecordsDeleted(int value) {
        this.recordsDeleted = value;
    }

}
