
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getPartyByGLNEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getPartyByGLNEnum">
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
@XmlType(name = "getPartyByGLNEnum")
@XmlEnum
public enum GetPartyByGLNEnum {

    API_ERROR,
    OK,
    INVALID_GLN,
    GLN_NOT_EXIST;

    public String value() {
        return name();
    }

    public static GetPartyByGLNEnum fromValue(String v) {
        return valueOf(v);
    }

}
