
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getTradeitemsByGTINsEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getTradeitemsByGTINsEnum">
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
@XmlType(name = "getTradeitemsByGTINsEnum")
@XmlEnum
public enum GetTradeitemsByGTINsEnum {

    API_ERROR,
    OK,
    NO_RESULTS,
    ENDED_QUOTA,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static GetTradeitemsByGTINsEnum fromValue(String v) {
        return valueOf(v);
    }

}
