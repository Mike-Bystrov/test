
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fmpContentPK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="fmpContentPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="fmpuuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fmpContentPK", propOrder = {
    "globaltradeitemnumber",
    "fmpuuid"
})
public class FmpContentPK {

    protected long globaltradeitemnumber;
    protected String fmpuuid;

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
     * Gets the value of the fmpuuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmpuuid() {
        return fmpuuid;
    }

    /**
     * Sets the value of the fmpuuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmpuuid(String value) {
        this.fmpuuid = value;
    }

}
