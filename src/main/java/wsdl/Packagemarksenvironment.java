
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packagemarksenvironment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="packagemarksenvironment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="packagemarksenvironmentPK" type="{http://globalservice.ws.bept.ids.by/}packagemarksenvironmentPK" minOccurs="0"/>
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
@XmlType(name = "packagemarksenvironment", propOrder = {
    "packagemarksenvironmentPK",
    "packagingmarking"
})
public class Packagemarksenvironment {

    protected PackagemarksenvironmentPK packagemarksenvironmentPK;
    protected Packagingmarking packagingmarking;

    /**
     * Gets the value of the packagemarksenvironmentPK property.
     * 
     * @return
     *     possible object is
     *     {@link PackagemarksenvironmentPK }
     *     
     */
    public PackagemarksenvironmentPK getPackagemarksenvironmentPK() {
        return packagemarksenvironmentPK;
    }

    /**
     * Sets the value of the packagemarksenvironmentPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagemarksenvironmentPK }
     *     
     */
    public void setPackagemarksenvironmentPK(PackagemarksenvironmentPK value) {
        this.packagemarksenvironmentPK = value;
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
