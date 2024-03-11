
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for searchTradeitemsByTNVEDEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="searchTradeitemsByTNVEDEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_NAME"/>
 *     <enumeration value="INVALID_RECORD_COUNT"/>
 *     <enumeration value="INVALID_START_RECORD"/>
 *     <enumeration value="NO_RESULTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "searchTradeitemsByTNVEDEnum")
@XmlEnum
public enum SearchTradeitemsByTNVEDEnum {

    API_ERROR,
    OK,
    INVALID_NAME,
    INVALID_RECORD_COUNT,
    INVALID_START_RECORD,
    NO_RESULTS;

    public String value() {
        return name();
    }

    public static SearchTradeitemsByTNVEDEnum fromValue(String v) {
        return valueOf(v);
    }

}
