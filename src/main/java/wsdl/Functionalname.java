
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for functionalname complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="functionalname">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="functionalnamePK" type="{http://globalservice.ws.bept.ids.by/}functionalnamePK" minOccurs="0"/>
 *         <element name="functionalname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "functionalname", propOrder = {
    "functionalnamePK",
    "functionalname",
    "tradeitem"
})
public class Functionalname {

    protected FunctionalnamePK functionalnamePK;
    protected String functionalname;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the functionalnamePK property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionalnamePK }
     *     
     */
    public FunctionalnamePK getFunctionalnamePK() {
        return functionalnamePK;
    }

    /**
     * Sets the value of the functionalnamePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionalnamePK }
     *     
     */
    public void setFunctionalnamePK(FunctionalnamePK value) {
        this.functionalnamePK = value;
    }

    /**
     * Gets the value of the functionalname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalname() {
        return functionalname;
    }

    /**
     * Sets the value of the functionalname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalname(String value) {
        this.functionalname = value;
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
