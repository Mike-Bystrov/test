
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageNutrient complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="foodBeverageNutrient">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="foodBeverageNutrientPK" type="{http://globalservice.ws.bept.ids.by/}foodBeverageNutrientPK" minOccurs="0"/>
 *         <element name="nurtienttypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="measurementprecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="percentageofdailyvalueintake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unitmeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="measurementprecisionvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foodBeverageNutrient", propOrder = {
    "foodBeverageNutrientPK",
    "nurtienttypecode",
    "measurementprecision",
    "percentageofdailyvalueintake",
    "unitmeasure",
    "measurementprecisionvalue",
    "tradeitem"
})
public class FoodBeverageNutrient {

    protected FoodBeverageNutrientPK foodBeverageNutrientPK;
    protected String nurtienttypecode;
    protected String measurementprecision;
    protected String percentageofdailyvalueintake;
    protected String unitmeasure;
    protected String measurementprecisionvalue;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the foodBeverageNutrientPK property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageNutrientPK }
     *     
     */
    public FoodBeverageNutrientPK getFoodBeverageNutrientPK() {
        return foodBeverageNutrientPK;
    }

    /**
     * Sets the value of the foodBeverageNutrientPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageNutrientPK }
     *     
     */
    public void setFoodBeverageNutrientPK(FoodBeverageNutrientPK value) {
        this.foodBeverageNutrientPK = value;
    }

    /**
     * Gets the value of the nurtienttypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNurtienttypecode() {
        return nurtienttypecode;
    }

    /**
     * Sets the value of the nurtienttypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNurtienttypecode(String value) {
        this.nurtienttypecode = value;
    }

    /**
     * Gets the value of the measurementprecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementprecision() {
        return measurementprecision;
    }

    /**
     * Sets the value of the measurementprecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementprecision(String value) {
        this.measurementprecision = value;
    }

    /**
     * Gets the value of the percentageofdailyvalueintake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageofdailyvalueintake() {
        return percentageofdailyvalueintake;
    }

    /**
     * Sets the value of the percentageofdailyvalueintake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageofdailyvalueintake(String value) {
        this.percentageofdailyvalueintake = value;
    }

    /**
     * Gets the value of the unitmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitmeasure() {
        return unitmeasure;
    }

    /**
     * Sets the value of the unitmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitmeasure(String value) {
        this.unitmeasure = value;
    }

    /**
     * Gets the value of the measurementprecisionvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementprecisionvalue() {
        return measurementprecisionvalue;
    }

    /**
     * Sets the value of the measurementprecisionvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementprecisionvalue(String value) {
        this.measurementprecisionvalue = value;
    }

    /**
     * Gets the value of the tradeitem property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitem }
     *     
     */
    public Tradeitem getTradeitem() {
        return tradeitem;
    }

    /**
     * Sets the value of the tradeitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitem }
     *     
     */
    public void setTradeitem(Tradeitem value) {
        this.tradeitem = value;
    }

}
