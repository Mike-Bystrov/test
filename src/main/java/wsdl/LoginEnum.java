
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for loginEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="loginEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_USERNAME"/>
 *     <enumeration value="INVALID_PASSWORD"/>
 *     <enumeration value="INVALID_USERNAME_OR_PASSWORD"/>
 *     <enumeration value="NO_ACCESS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "loginEnum")
@XmlEnum
public enum LoginEnum {

    OK,
    INVALID_USERNAME,
    INVALID_PASSWORD,
    INVALID_USERNAME_OR_PASSWORD,
    NO_ACCESS;

    public String value() {
        return name();
    }

    public static LoginEnum fromValue(String v) {
        return valueOf(v);
    }

}
