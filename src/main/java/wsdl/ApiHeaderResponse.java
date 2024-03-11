
package wsdl;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for apiHeaderResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="apiHeaderResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}apiHeaderEnum" minOccurs="0"/>
 *         <element name="sessiontoken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiHeaderResponse", propOrder = {
    "errorCode",
    "sessiontoken"
})
@XmlSeeAlso({
    ApiHeaderResponseWithDataSource.class
})
public class ApiHeaderResponse {

    @XmlSchemaType(name = "string")
    protected ApiHeaderEnum errorCode;
    protected String sessiontoken;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ApiHeaderEnum }
     *     
     */
    public ApiHeaderEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiHeaderEnum }
     *     
     */
    public void setErrorCode(ApiHeaderEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the sessiontoken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessiontoken() {
        return sessiontoken;
    }

    /**
     * Sets the value of the sessiontoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessiontoken(String value) {
        this.sessiontoken = value;
    }

}
