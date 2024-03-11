
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pckgmarkedexpirationdatetype complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="pckgmarkedexpirationdatetype">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pckgmarkedexpirationdatetypePK" type="{http://globalservice.ws.bept.ids.by/}pckgmarkedexpirationdatetypePK" minOccurs="0"/>
 *         <element name="packagingmarking" type="{http://globalservice.ws.bept.ids.by/}packagingmarking" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pckgmarkedexpirationdatetype", propOrder = {
    "pckgmarkedexpirationdatetypePK",
    "packagingmarking"
})
public class Pckgmarkedexpirationdatetype {

    protected PckgmarkedexpirationdatetypePK pckgmarkedexpirationdatetypePK;
    protected Packagingmarking packagingmarking;

    /**
     * Gets the value of the pckgmarkedexpirationdatetypePK property.
     * 
     * @return
     *     possible object is
     *     {@link PckgmarkedexpirationdatetypePK }
     *     
     */
    public PckgmarkedexpirationdatetypePK getPckgmarkedexpirationdatetypePK() {
        return pckgmarkedexpirationdatetypePK;
    }

    /**
     * Sets the value of the pckgmarkedexpirationdatetypePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PckgmarkedexpirationdatetypePK }
     *     
     */
    public void setPckgmarkedexpirationdatetypePK(PckgmarkedexpirationdatetypePK value) {
        this.pckgmarkedexpirationdatetypePK = value;
    }

    /**
     * Gets the value of the packagingmarking property.
     * 
     * @return
     *     possible object is
     *     {@link Packagingmarking }
     *     
     */
    public Packagingmarking getPackagingmarking() {
        return packagingmarking;
    }

    /**
     * Sets the value of the packagingmarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packagingmarking }
     *     
     */
    public void setPackagingmarking(Packagingmarking value) {
        this.packagingmarking = value;
    }

}
