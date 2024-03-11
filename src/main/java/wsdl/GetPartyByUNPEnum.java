
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getPartyByUNPEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getPartyByUNPEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_UNP"/>
 *     <enumeration value="UNP_NOT_EXIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getPartyByUNPEnum")
@XmlEnum
public enum GetPartyByUNPEnum {

    API_ERROR,
    OK,
    INVALID_UNP,
    UNP_NOT_EXIST;

    public String value() {
        return name();
    }

    public static GetPartyByUNPEnum fromValue(String v) {
        return valueOf(v);
    }

}
