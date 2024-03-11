
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for cleanTradeitemsOfPoolByDeleteTimeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="cleanTradeitemsOfPoolByDeleteTimeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="NO_RESULTS"/>
 *     <enumeration value="ENDED_QUOTA"/>
 *     <enumeration value="INTERNAL_ERROR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "cleanTradeitemsOfPoolByDeleteTimeEnum")
@XmlEnum
public enum CleanTradeitemsOfPoolByDeleteTimeEnum {

    API_ERROR,
    OK,
    NO_RESULTS,
    ENDED_QUOTA,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static CleanTradeitemsOfPoolByDeleteTimeEnum fromValue(String v) {
        return valueOf(v);
    }

}
