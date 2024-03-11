
package wsdl;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for quotaimportAddos complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="quotaimportAddos">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="LegalShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="tradeitemrbnumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quotaimportAddos", propOrder = {
    "selected",
    "legalShortName",
    "tradeitemnumber",
    "tradeitemrbnumber"
})
@XmlSeeAlso({
    Quotaimport.class
})
public class QuotaimportAddos {

    protected boolean selected;
    @XmlElement(name = "LegalShortName")
    protected String legalShortName;
    protected long tradeitemnumber;
    protected long tradeitemrbnumber;

    /**
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the legalShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalShortName() {
        return legalShortName;
    }

    /**
     * Sets the value of the legalShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalShortName(String value) {
        this.legalShortName = value;
    }

    /**
     * Gets the value of the tradeitemnumber property.
     * 
     */
    public long getTradeitemnumber() {
        return tradeitemnumber;
    }

    /**
     * Sets the value of the tradeitemnumber property.
     * 
     */
    public void setTradeitemnumber(long value) {
        this.tradeitemnumber = value;
    }

    /**
     * Gets the value of the tradeitemrbnumber property.
     * 
     */
    public long getTradeitemrbnumber() {
        return tradeitemrbnumber;
    }

    /**
     * Sets the value of the tradeitemrbnumber property.
     * 
     */
    public void setTradeitemrbnumber(long value) {
        this.tradeitemrbnumber = value;
    }

}
