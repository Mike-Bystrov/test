
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getCheckGTIN29Enum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getCheckGTIN29Enum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_GTIN"/>
 *     <enumeration value="GTIN_IS_NOT_LIMITED_CIRCULATION"/>
 *     <enumeration value="GLN_DONT_EXIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getCheckGTIN29Enum")
@XmlEnum
public enum GetCheckGTIN29Enum {

    API_ERROR,
    OK,
    INVALID_GTIN,
    GTIN_IS_NOT_LIMITED_CIRCULATION,
    GLN_DONT_EXIST;

    public String value() {
        return name();
    }

    public static GetCheckGTIN29Enum fromValue(String v) {
        return valueOf(v);
    }

}
