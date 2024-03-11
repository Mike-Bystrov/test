
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for searchTradeitemsByGLNEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="searchTradeitemsByGLNEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_GLN"/>
 *     <enumeration value="INVALID_RECORD_COUNT"/>
 *     <enumeration value="INVALID_START_RECORD"/>
 *     <enumeration value="NO_RESULTS"/>
 *     <enumeration value="GLN_DONT_EXIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "searchTradeitemsByGLNEnum")
@XmlEnum
public enum SearchTradeitemsByGLNEnum {

    API_ERROR,
    OK,
    INVALID_GLN,
    INVALID_RECORD_COUNT,
    INVALID_START_RECORD,
    NO_RESULTS,
    GLN_DONT_EXIST;

    public String value() {
        return name();
    }

    public static SearchTradeitemsByGLNEnum fromValue(String v) {
        return valueOf(v);
    }

}
