
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partygcpPK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="partygcpPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gln" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="gcp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partygcpPK", propOrder = {
    "gln",
    "gcp"
})
public class PartygcpPK {

    protected long gln;
    protected int gcp;

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
     * Gets the value of the gcp property.
     * 
     */
    public int getGcp() {
        return gcp;
    }

    /**
     * Sets the value of the gcp property.
     * 
     */
    public void setGcp(int value) {
        this.gcp = value;
    }

}
