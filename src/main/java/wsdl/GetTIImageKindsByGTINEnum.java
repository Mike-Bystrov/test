
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getTIImageKindsByGTINEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getTIImageKindsByGTINEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_LIST_OF_GTINS"/>
 *     <enumeration value="INTERNAL_ERROR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getTIImageKindsByGTINEnum")
@XmlEnum
public enum GetTIImageKindsByGTINEnum {

    API_ERROR,
    OK,
    INVALID_LIST_OF_GTINS,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static GetTIImageKindsByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
