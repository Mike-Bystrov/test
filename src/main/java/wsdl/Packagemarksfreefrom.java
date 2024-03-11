
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packagemarksfreefrom complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="packagemarksfreefrom">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="packagemarksfreefromPK" type="{http://globalservice.ws.bept.ids.by/}packagemarksfreefromPK" minOccurs="0"/>
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
@XmlType(name = "packagemarksfreefrom", propOrder = {
    "packagemarksfreefromPK",
    "packagingmarking"
})
public class Packagemarksfreefrom {

    protected PackagemarksfreefromPK packagemarksfreefromPK;
    protected Packagingmarking packagingmarking;

    /**
     * Gets the value of the packagemarksfreefromPK property.
     * 
     * @return
     *     possible object is
     *     {@link PackagemarksfreefromPK }
     *     
     */
    public PackagemarksfreefromPK getPackagemarksfreefromPK() {
        return packagemarksfreefromPK;
    }

    /**
     * Sets the value of the packagemarksfreefromPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagemarksfreefromPK }
     *     
     */
    public void setPackagemarksfreefromPK(PackagemarksfreefromPK value) {
        this.packagemarksfreefromPK = value;
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
