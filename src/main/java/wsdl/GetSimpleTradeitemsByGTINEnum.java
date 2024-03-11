
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getSimpleTradeitemsByGTINEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getSimpleTradeitemsByGTINEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="PARTLY_OK"/>
 *     <enumeration value="INVALID_LIST"/>
 *     <enumeration value="INVALID_LANG"/>
 *     <enumeration value="ENDED_QUOTA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getSimpleTradeitemsByGTINEnum")
@XmlEnum
public enum GetSimpleTradeitemsByGTINEnum {

    API_ERROR,
    OK,
    PARTLY_OK,
    INVALID_LIST,
    INVALID_LANG,
    ENDED_QUOTA;

    public String value() {
        return name();
    }

    public static GetSimpleTradeitemsByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
