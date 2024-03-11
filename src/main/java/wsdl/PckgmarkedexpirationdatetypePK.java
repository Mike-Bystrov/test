
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pckgmarkedexpirationdatetypePK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="pckgmarkedexpirationdatetypePK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pckgmarkedexpirationdatetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pckgmarkedexpirationdatetypePK", propOrder = {
    "globaltradeitemnumber",
    "pckgmarkedexpirationdatetype"
})
public class PckgmarkedexpirationdatetypePK {

    protected long globaltradeitemnumber;
    protected String pckgmarkedexpirationdatetype;

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
     * Gets the value of the pckgmarkedexpirationdatetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPckgmarkedexpirationdatetype() {
        return pckgmarkedexpirationdatetype;
    }

    /**
     * Sets the value of the pckgmarkedexpirationdatetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPckgmarkedexpirationdatetype(String value) {
        this.pckgmarkedexpirationdatetype = value;
    }

}
