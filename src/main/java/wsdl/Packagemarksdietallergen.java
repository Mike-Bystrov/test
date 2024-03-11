
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packagemarksdietallergen complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="packagemarksdietallergen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="packagemarksdietallergenPK" type="{http://globalservice.ws.bept.ids.by/}packagemarksdietallergenPK" minOccurs="0"/>
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
@XmlType(name = "packagemarksdietallergen", propOrder = {
    "packagemarksdietallergenPK",
    "packagingmarking"
})
public class Packagemarksdietallergen {

    protected PackagemarksdietallergenPK packagemarksdietallergenPK;
    protected Packagingmarking packagingmarking;

    /**
     * Gets the value of the packagemarksdietallergenPK property.
     * 
     * @return
     *     possible object is
     *     {@link PackagemarksdietallergenPK }
     *     
     */
    public PackagemarksdietallergenPK getPackagemarksdietallergenPK() {
        return packagemarksdietallergenPK;
    }

    /**
     * Sets the value of the packagemarksdietallergenPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagemarksdietallergenPK }
     *     
     */
    public void setPackagemarksdietallergenPK(PackagemarksdietallergenPK value) {
        this.packagemarksdietallergenPK = value;
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
