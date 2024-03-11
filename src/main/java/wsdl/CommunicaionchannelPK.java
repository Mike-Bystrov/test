
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;


/**
 * <p>Java class for communicaionchannelPK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="communicaionchannelPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="contactid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="communicationchannelcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="communicationnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "communicaionchannelPK", propOrder = {
    "contactid",
    "communicationchannelcode",
    "communicationnumber"
})
public class CommunicaionchannelPK {

    protected BigDecimal contactid;
    protected String communicationchannelcode;
    protected String communicationnumber;

    /**
     * Gets the value of the contactid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContactid() {
        return contactid;
    }

    /**
     * Sets the value of the contactid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContactid(BigDecimal value) {
        this.contactid = value;
    }

    /**
     * Gets the value of the communicationchannelcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationchannelcode() {
        return communicationchannelcode;
    }

    /**
     * Sets the value of the communicationchannelcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationchannelcode(String value) {
        this.communicationchannelcode = value;
    }

    /**
     * Gets the value of the communicationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationnumber() {
        return communicationnumber;
    }

    /**
     * Sets the value of the communicationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationnumber(String value) {
        this.communicationnumber = value;
    }

}
