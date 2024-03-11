
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getTradeitemsOfPoolByModifiedTimeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getTradeitemsOfPoolByModifiedTimeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="NO_RESULTS"/>
 *     <enumeration value="ENDED_QUOTA"/>
 *     <enumeration value="INVALID_DATE"/>
 *     <enumeration value="INTERNAL_ERROR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getTradeitemsOfPoolByModifiedTimeEnum")
@XmlEnum
public enum GetTradeitemsOfPoolByModifiedTimeEnum {

    API_ERROR,
    OK,
    NO_RESULTS,
    ENDED_QUOTA,
    INVALID_DATE,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static GetTradeitemsOfPoolByModifiedTimeEnum fromValue(String v) {
        return valueOf(v);
    }

}
