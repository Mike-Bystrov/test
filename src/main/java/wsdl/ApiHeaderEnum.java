
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for apiHeaderEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="apiHeaderEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OK"/>
 *     <enumeration value="INTERNAL_ERROR"/>
 *     <enumeration value="SESSION_EXPIRED"/>
 *     <enumeration value="INVALID_HEADER"/>
 *     <enumeration value="INVALID_SESSIONTOKEN"/>
 *     <enumeration value="NO_SESSION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "apiHeaderEnum")
@XmlEnum
public enum ApiHeaderEnum {

    OK,
    INTERNAL_ERROR,
    SESSION_EXPIRED,
    INVALID_HEADER,
    INVALID_SESSIONTOKEN,
    NO_SESSION;

    public String value() {
        return name();
    }

    public static ApiHeaderEnum fromValue(String v) {
        return valueOf(v);
    }

}
