
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fmpContentInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="fmpContentInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="fmptypecodelistagency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fmptypecodelistidentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fmpContentInformation", propOrder = {
    "globaltradeitemnumber",
    "fmptypecodelistagency",
    "fmptypecodelistidentification",
    "tradeitem"
})
public class FmpContentInformation {

    protected Long globaltradeitemnumber;
    protected String fmptypecodelistagency;
    protected String fmptypecodelistidentification;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the globaltradeitemnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGlobaltradeitemnumber() {
        return globaltradeitemnumber;
    }

    /**
     * Sets the value of the globaltradeitemnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGlobaltradeitemnumber(Long value) {
        this.globaltradeitemnumber = value;
    }

    /**
     * Gets the value of the fmptypecodelistagency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmptypecodelistagency() {
        return fmptypecodelistagency;
    }

    /**
     * Sets the value of the fmptypecodelistagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmptypecodelistagency(String value) {
        this.fmptypecodelistagency = value;
    }

    /**
     * Gets the value of the fmptypecodelistidentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmptypecodelistidentification() {
        return fmptypecodelistidentification;
    }

    /**
     * Sets the value of the fmptypecodelistidentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmptypecodelistidentification(String value) {
        this.fmptypecodelistidentification = value;
    }

    /**
     * Gets the value of the tradeitem property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitem }
     *     
     */
    public Tradeitem getTradeitem() {
        return tradeitem;
    }

    /**
     * Sets the value of the tradeitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitem }
     *     
     */
    public void setTradeitem(Tradeitem value) {
        this.tradeitem = value;
    }

}
