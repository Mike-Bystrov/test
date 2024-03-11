
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packagemarksethicalPK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="packagemarksethicalPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packagemarksethical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packagemarksethicalPK", propOrder = {
    "globaltradeitemnumber",
    "packagemarksethical"
})
public class PackagemarksethicalPK {

    protected long globaltradeitemnumber;
    protected String packagemarksethical;

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
     * Gets the value of the packagemarksethical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagemarksethical() {
        return packagemarksethical;
    }

    /**
     * Sets the value of the packagemarksethical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagemarksethical(String value) {
        this.packagemarksethical = value;
    }

}
