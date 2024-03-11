
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getShortTradeitemByGTINResp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getShortTradeitemByGTINResp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}getTradeitemByGTINEnum" minOccurs="0"/>
 *         <element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/>
 *         <element name="quota" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="ti" type="{http://globalservice.ws.bept.ids.by/}shortTradeItem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getShortTradeitemByGTINResp", propOrder = {
    "errorCode",
    "header",
    "quota",
    "ti"
})
public class GetShortTradeitemByGTINResp {

    @XmlSchemaType(name = "string")
    protected GetTradeitemByGTINEnum errorCode;
    protected ApiHeaderResponse header;
    protected long quota;
    protected ShortTradeItem ti;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetTradeitemByGTINEnum }
     *     
     */
    public GetTradeitemByGTINEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTradeitemByGTINEnum }
     *     
     */
    public void setErrorCode(GetTradeitemByGTINEnum value) {
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
     * Gets the value of the quota property.
     * 
     */
    public long getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     */
    public void setQuota(long value) {
        this.quota = value;
    }

    /**
     * Gets the value of the ti property.
     * 
     * @return
     *     possible object is
     *     {@link ShortTradeItem }
     *     
     */
    public ShortTradeItem getTi() {
        return ti;
    }

    /**
     * Sets the value of the ti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortTradeItem }
     *     
     */
    public void setTi(ShortTradeItem value) {
        this.ti = value;
    }

}
