
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getTradeitemByGTINEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getTradeitemByGTINEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_GTIN"/>
 *     <enumeration value="ENDED_QUOTA"/>
 *     <enumeration value="GTIN_DONT_EXIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getTradeitemByGTINEnum")
@XmlEnum
public enum GetTradeitemByGTINEnum {

    API_ERROR,
    OK,
    INVALID_GTIN,
    ENDED_QUOTA,
    GTIN_DONT_EXIST;

    public String value() {
        return name();
    }

    public static GetTradeitemByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
