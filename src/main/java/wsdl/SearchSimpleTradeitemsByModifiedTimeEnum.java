
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for searchSimpleTradeitemsByModifiedTimeEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="searchSimpleTradeitemsByModifiedTimeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_FROMDATE"/>
 *     <enumeration value="INVALID_TODATE"/>
 *     <enumeration value="INVALID_RECORD_COUNT"/>
 *     <enumeration value="INVALID_START_RECORD"/>
 *     <enumeration value="INVALID_ROLE"/>
 *     <enumeration value="NO_RESULTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "searchSimpleTradeitemsByModifiedTimeEnum")
@XmlEnum
public enum SearchSimpleTradeitemsByModifiedTimeEnum {

    API_ERROR,
    OK,
    INVALID_FROMDATE,
    INVALID_TODATE,
    INVALID_RECORD_COUNT,
    INVALID_START_RECORD,
    INVALID_ROLE,
    NO_RESULTS;

    public String value() {
        return name();
    }

    public static SearchSimpleTradeitemsByModifiedTimeEnum fromValue(String v) {
        return valueOf(v);
    }

}
