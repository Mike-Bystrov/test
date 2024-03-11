
package wsdl;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for getTradeitemsByGTINsShortResp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getTradeitemsByGTINsShortResp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}getTradeitemsByGTINsEnum" minOccurs="0"/>
 *         <element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/>
 *         <element name="quota" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="tradeitems" type="{http://globalservice.ws.bept.ids.by/}shortTradeItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTradeitemsByGTINsShortResp", propOrder = {
    "errorCode",
    "header",
    "quota",
    "tradeitems"
})
public class GetTradeitemsByGTINsShortResp {

    @XmlSchemaType(name = "string")
    protected GetTradeitemsByGTINsEnum errorCode;
    protected ApiHeaderResponse header;
    protected long quota;
    @XmlElement(nillable = true)
    protected List<ShortTradeItem> tradeitems;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetTradeitemsByGTINsEnum }
     *     
     */
    public GetTradeitemsByGTINsEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTradeitemsByGTINsEnum }
     *     
     */
    public void setErrorCode(GetTradeitemsByGTINsEnum value) {
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
     * Gets the value of the tradeitems property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitems property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTradeitems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShortTradeItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the tradeitems property.
     */
    public List<ShortTradeItem> getTradeitems() {
        if (tradeitems == null) {
            tradeitems = new ArrayList<>();
        }
        return this.tradeitems;
    }

}
