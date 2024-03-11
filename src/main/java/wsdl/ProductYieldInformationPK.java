
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productYieldInformationPK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="productYieldInformationPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="yielduuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productYieldInformationPK", propOrder = {
    "globaltradeitemnumber",
    "yielduuid"
})
public class ProductYieldInformationPK {

    protected long globaltradeitemnumber;
    protected String yielduuid;

    /**
     * Gets the value of the globaltradeitemnumber property.
     * 
     */
    public long getGlobaltradeitemnumber() {
        return globaltradeitemnumber;
    }

    /**
     * Sets the value of the globaltradeitemnumber property.
     * 
     */
    public void setGlobaltradeitemnumber(long value) {
        this.globaltradeitemnumber = value;
    }

    /**
     * Gets the value of the yielduuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYielduuid() {
        return yielduuid;
    }

    /**
     * Sets the value of the yielduuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYielduuid(String value) {
        this.yielduuid = value;
    }

}
