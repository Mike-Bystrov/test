
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for childtradeitemPK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="childtradeitemPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="gtinofnextlowerlevelti" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childtradeitemPK", propOrder = {
    "globaltradeitemnumber",
    "gtinofnextlowerlevelti"
})
public class ChildtradeitemPK {

    protected long globaltradeitemnumber;
    protected long gtinofnextlowerlevelti;

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
     * Gets the value of the gtinofnextlowerlevelti property.
     * 
     */
    public long getGtinofnextlowerlevelti() {
        return gtinofnextlowerlevelti;
    }

    /**
     * Sets the value of the gtinofnextlowerlevelti property.
     * 
     */
    public void setGtinofnextlowerlevelti(long value) {
        this.gtinofnextlowerlevelti = value;
    }

}
