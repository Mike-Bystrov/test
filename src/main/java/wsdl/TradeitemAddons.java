
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemAddons complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="tradeitemAddons">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="unread" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemAddons", propOrder = {
    "selected",
    "unread"
})
@XmlSeeAlso({
    Tradeitem.class,
    Userpools.class
})
public class TradeitemAddons {

    protected boolean selected;
    protected boolean unread;

    /**
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the unread property.
     * 
     */
    public boolean isUnread() {
        return unread;
    }

    /**
     * Sets the value of the unread property.
     * 
     */
    public void setUnread(boolean value) {
        this.unread = value;
    }

}
