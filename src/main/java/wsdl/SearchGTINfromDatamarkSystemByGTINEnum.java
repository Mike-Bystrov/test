
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for searchGTINfromDatamarkSystemByGTINEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="searchGTINfromDatamarkSystemByGTINEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="INVALID_GTIN"/>
 *     <enumeration value="INVALID_ROLE"/>
 *     <enumeration value="GTIN_DONT_EXIST"/>
 *     <enumeration value="NO_RESULTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "searchGTINfromDatamarkSystemByGTINEnum")
@XmlEnum
public enum SearchGTINfromDatamarkSystemByGTINEnum {

    API_ERROR,
    OK,
    INVALID_GTIN,
    INVALID_ROLE,
    GTIN_DONT_EXIST,
    NO_RESULTS;

    public String value() {
        return name();
    }

    public static SearchGTINfromDatamarkSystemByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
