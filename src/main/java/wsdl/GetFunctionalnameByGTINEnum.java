
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getFunctionalnameByGTINEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getFunctionalnameByGTINEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_GTIN"/>
 *     <enumeration value="INVALID_LANG"/>
 *     <enumeration value="LANG_DONT_EXIST"/>
 *     <enumeration value="GTIN_DONT_EXIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getFunctionalnameByGTINEnum")
@XmlEnum
public enum GetFunctionalnameByGTINEnum {

    API_ERROR,
    OK,
    INVALID_GTIN,
    INVALID_LANG,
    LANG_DONT_EXIST,
    GTIN_DONT_EXIST;

    public String value() {
        return name();
    }

    public static GetFunctionalnameByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
