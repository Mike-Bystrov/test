
package wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for classificatorEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="classificatorEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLASSIFICATOR005"/>
 *     <enumeration value="CLASSIFICATOR007"/>
 *     <enumeration value="TNVED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "classificatorEnum")
@XmlEnum
public enum ClassificatorEnum {

    @XmlEnumValue("CLASSIFICATOR005")
    CLASSIFICATOR_005("CLASSIFICATOR005"),
    @XmlEnumValue("CLASSIFICATOR007")
    CLASSIFICATOR_007("CLASSIFICATOR007"),
    TNVED("TNVED");
    private final String value;

    ClassificatorEnum(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static ClassificatorEnum fromValue(String v) {
        for (ClassificatorEnum c: ClassificatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
