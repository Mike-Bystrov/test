
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for searchTradeitemsByOKRB007Enum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="searchTradeitemsByOKRB007Enum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_NAME"/>
 *     <enumeration value="INVALID_RECORD_COUNT"/>
 *     <enumeration value="INVALID_START_RECORD"/>
 *     <enumeration value="NO_RESULTS"/>
 *     <enumeration value="INVALID_CLASSIFICATOR_VERSION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "searchTradeitemsByOKRB007Enum")
@XmlEnum
public enum SearchTradeitemsByOKRB007Enum {

    API_ERROR,
    OK,
    INVALID_NAME,
    INVALID_RECORD_COUNT,
    INVALID_START_RECORD,
    NO_RESULTS,
    INVALID_CLASSIFICATOR_VERSION;

    public String value() {
        return name();
    }

    public static SearchTradeitemsByOKRB007Enum fromValue(String v) {
        return valueOf(v);
    }

}
