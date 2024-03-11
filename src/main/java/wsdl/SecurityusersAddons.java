
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for securityusersAddons complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="securityusersAddons">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="gtnNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityusersAddons", propOrder = {
    "selected",
    "gtnNumber"
})
@XmlSeeAlso({
    Securityusers.class
})
public class SecurityusersAddons {

    protected boolean selected;
    protected String gtnNumber;

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
     * Gets the value of the gtnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtnNumber() {
        return gtnNumber;
    }

    /**
     * Sets the value of the gtnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtnNumber(String value) {
        this.gtnNumber = value;
    }

}
