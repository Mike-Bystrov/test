
package wsdl;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for getTradeitemsOfPoolByModifiedTimeResp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getTradeitemsOfPoolByModifiedTimeResp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="currentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="deletedTis" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}getTradeitemsOfPoolByModifiedTimeEnum" minOccurs="0"/>
 *         <element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/>
 *         <element name="tis" type="{http://globalservice.ws.bept.ids.by/}tradeitem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTradeitemsOfPoolByModifiedTimeResp", propOrder = {
    "currentDate",
    "deletedTis",
    "errorCode",
    "header",
    "tis"
})
public class GetTradeitemsOfPoolByModifiedTimeResp {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentDate;
    @XmlElement(nillable = true)
    protected List<Long> deletedTis;
    @XmlSchemaType(name = "string")
    protected GetTradeitemsOfPoolByModifiedTimeEnum errorCode;
    protected ApiHeaderResponse header;
    @XmlElement(nillable = true)
    protected List<Tradeitem> tis;

    /**
     * Gets the value of the currentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentDate() {
        return currentDate;
    }

    /**
     * Sets the value of the currentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentDate(XMLGregorianCalendar value) {
        this.currentDate = value;
    }

    /**
     * Gets the value of the deletedTis property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedTis property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeletedTis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * </p>
     * 
     * 
     * @return
     *     The value of the deletedTis property.
     */
    public List<Long> getDeletedTis() {
        if (deletedTis == null) {
            deletedTis = new ArrayList<>();
        }
        return this.deletedTis;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetTradeitemsOfPoolByModifiedTimeEnum }
     *     
     */
    public GetTradeitemsOfPoolByModifiedTimeEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTradeitemsOfPoolByModifiedTimeEnum }
     *     
     */
    public void setErrorCode(GetTradeitemsOfPoolByModifiedTimeEnum value) {
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
     * Gets the value of the tis property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tis property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tradeitem }
     * </p>
     * 
     * 
     * @return
     *     The value of the tis property.
     */
    public List<Tradeitem> getTis() {
        if (tis == null) {
            tis = new ArrayList<>();
        }
        return this.tis;
    }

}
