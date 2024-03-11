
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getFullPartyByGLNEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getFullPartyByGLNEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_GLN"/>
 *     <enumeration value="GLN_NOT_EXIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getFullPartyByGLNEnum")
@XmlEnum
public enum GetFullPartyByGLNEnum {

    API_ERROR,
    OK,
    INVALID_GLN,
    GLN_NOT_EXIST;

    public String value() {
        return name();
    }

    public static GetFullPartyByGLNEnum fromValue(String v) {
        return valueOf(v);
    }

}
