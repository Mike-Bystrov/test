
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchGTINfromDatamarkSystemByGTINResp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="searchGTINfromDatamarkSystemByGTINResp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}searchGTINfromDatamarkSystemByGTINEnum" minOccurs="0"/>
 *         <element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponseWithDataSource" minOccurs="0"/>
 *         <element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}simpleTradeitem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchGTINfromDatamarkSystemByGTINResp", propOrder = {
    "errorCode",
    "header",
    "tradeitem"
})
public class SearchGTINfromDatamarkSystemByGTINResp {

    @XmlSchemaType(name = "string")
    protected SearchGTINfromDatamarkSystemByGTINEnum errorCode;
    protected ApiHeaderResponseWithDataSource header;
    protected SimpleTradeitem tradeitem;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchGTINfromDatamarkSystemByGTINEnum }
     *     
     */
    public SearchGTINfromDatamarkSystemByGTINEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchGTINfromDatamarkSystemByGTINEnum }
     *     
     */
    public void setErrorCode(SearchGTINfromDatamarkSystemByGTINEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ApiHeaderResponseWithDataSource }
     *     
     */
    public ApiHeaderResponseWithDataSource getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiHeaderResponseWithDataSource }
     *     
     */
    public void setHeader(ApiHeaderResponseWithDataSource value) {
        this.header = value;
    }

    /**
     * Gets the value of the tradeitem property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTradeitem }
     *     
     */
    public SimpleTradeitem getTradeitem() {
        return tradeitem;
    }

    /**
     * Sets the value of the tradeitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTradeitem }
     *     
     */
    public void setTradeitem(SimpleTradeitem value) {
        this.tradeitem = value;
    }

}
