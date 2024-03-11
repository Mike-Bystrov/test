
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for targetmarketinformationPK complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="targetmarketinformationPK">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="targetmarketcountrycode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "targetmarketinformationPK", propOrder = {
    "globaltradeitemnumber",
    "targetmarketcountrycode"
})
public class TargetmarketinformationPK {

    protected long globaltradeitemnumber;
    protected short targetmarketcountrycode;

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
     * Gets the value of the targetmarketcountrycode property.
     * 
     */
    public short getTargetmarketcountrycode() {
        return targetmarketcountrycode;
    }

    /**
     * Sets the value of the targetmarketcountrycode property.
     * 
     */
    public void setTargetmarketcountrycode(short value) {
        this.targetmarketcountrycode = value;
    }

}
