
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for targetmarketinformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="targetmarketinformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="targetmarketinformationPK" type="{http://globalservice.ws.bept.ids.by/}targetmarketinformationPK" minOccurs="0"/>
 *         <element name="targetmarketdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="targetmarketsubdivisioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "targetmarketinformation", propOrder = {
    "targetmarketinformationPK",
    "targetmarketdescription",
    "targetmarketsubdivisioncode",
    "tradeitem"
})
public class Targetmarketinformation {

    protected TargetmarketinformationPK targetmarketinformationPK;
    protected String targetmarketdescription;
    protected String targetmarketsubdivisioncode;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the targetmarketinformationPK property.
     * 
     * @return
     *     possible object is
     *     {@link TargetmarketinformationPK }
     *     
     */
    public TargetmarketinformationPK getTargetmarketinformationPK() {
        return targetmarketinformationPK;
    }

    /**
     * Sets the value of the targetmarketinformationPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetmarketinformationPK }
     *     
     */
    public void setTargetmarketinformationPK(TargetmarketinformationPK value) {
        this.targetmarketinformationPK = value;
    }

    /**
     * Gets the value of the targetmarketdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetmarketdescription() {
        return targetmarketdescription;
    }

    /**
     * Sets the value of the targetmarketdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetmarketdescription(String value) {
        this.targetmarketdescription = value;
    }

    /**
     * Gets the value of the targetmarketsubdivisioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetmarketsubdivisioncode() {
        return targetmarketsubdivisioncode;
    }

    /**
     * Sets the value of the targetmarketsubdivisioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetmarketsubdivisioncode(String value) {
        this.targetmarketsubdivisioncode = value;
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
