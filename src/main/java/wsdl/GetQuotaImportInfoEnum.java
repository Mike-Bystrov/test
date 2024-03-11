
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for getQuotaImportInfoEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="getQuotaImportInfoEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="API_ERROR"/>
 *     <enumeration value="OK"/>
 *     <enumeration value="GLN_NOT_EXIST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "getQuotaImportInfoEnum")
@XmlEnum
public enum GetQuotaImportInfoEnum {

    API_ERROR,
    OK,
    GLN_NOT_EXIST;

    public String value() {
        return name();
    }

    public static GetQuotaImportInfoEnum fromValue(String v) {
        return valueOf(v);
    }

}
