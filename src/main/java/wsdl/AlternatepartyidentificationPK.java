
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alternatepartyidentificationPK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="alternatepartyidentificationPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gln" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="additionalpartyidentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alternatepartyidentificationPK", propOrder = {
    "gln",
    "additionalpartyidentification"
})
public class AlternatepartyidentificationPK {

    protected long gln;
    protected String additionalpartyidentification;

    /**
     * Gets the value of the gln property.
     * 
     */
    public long getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     */
    public void setGln(long value) {
        this.gln = value;
    }

    /**
     * Gets the value of the additionalpartyidentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalpartyidentification() {
        return additionalpartyidentification;
    }

    /**
     * Sets the value of the additionalpartyidentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalpartyidentification(String value) {
        this.additionalpartyidentification = value;
    }

}
