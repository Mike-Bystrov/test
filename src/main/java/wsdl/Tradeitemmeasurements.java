
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for tradeitemmeasurements complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="tradeitemmeasurements">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="casingtareweight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="casingtareweightuom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="genericingredient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hasdisplayreadypackaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ingredientstrength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="isnetcontentdeclarindicated" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         <element name="layerheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="layerheightuom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pricecomparisoncontenttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tpneutraltiinformation" type="{http://globalservice.ws.bept.ids.by/}tpneutraltiinformation" minOccurs="0"/>
 *         <element name="diameterCollection" type="{http://globalservice.ws.bept.ids.by/}diameter" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="grossweightCollection" type="{http://globalservice.ws.bept.ids.by/}grossweight" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="heightCollection" type="{http://globalservice.ws.bept.ids.by/}height" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="netweightCollection" type="{http://globalservice.ws.bept.ids.by/}netweight" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="depthCollection" type="{http://globalservice.ws.bept.ids.by/}depth" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="drainedweightCollection" type="{http://globalservice.ws.bept.ids.by/}drainedweight" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="netcontentCollection" type="{http://globalservice.ws.bept.ids.by/}netcontent" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="widthCollection" type="{http://globalservice.ws.bept.ids.by/}width" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemmeasurements", propOrder = {
    "globaltradeitemnumber",
    "casingtareweight",
    "casingtareweightuom",
    "genericingredient",
    "hasdisplayreadypackaging",
    "ingredientstrength",
    "isnetcontentdeclarindicated",
    "layerheight",
    "layerheightuom",
    "pricecomparisoncontenttype",
    "tpneutraltiinformation",
    "diameterCollection",
    "grossweightCollection",
    "heightCollection",
    "netweightCollection",
    "depthCollection",
    "drainedweightCollection",
    "netcontentCollection",
    "widthCollection"
})
public class Tradeitemmeasurements {

    protected Long globaltradeitemnumber;
    protected BigDecimal casingtareweight;
    protected String casingtareweightuom;
    protected String genericingredient;
    protected String hasdisplayreadypackaging;
    protected String ingredientstrength;
    protected Short isnetcontentdeclarindicated;
    protected BigDecimal layerheight;
    protected String layerheightuom;
    protected String pricecomparisoncontenttype;
    protected Tpneutraltiinformation tpneutraltiinformation;
    @XmlElement(nillable = true)
    protected List<Diameter> diameterCollection;
    @XmlElement(nillable = true)
    protected List<Grossweight> grossweightCollection;
    @XmlElement(nillable = true)
    protected List<Height> heightCollection;
    @XmlElement(nillable = true)
    protected List<Netweight> netweightCollection;
    @XmlElement(nillable = true)
    protected List<Depth> depthCollection;
    @XmlElement(nillable = true)
    protected List<Drainedweight> drainedweightCollection;
    @XmlElement(nillable = true)
    protected List<Netcontent> netcontentCollection;
    @XmlElement(nillable = true)
    protected List<Width> widthCollection;

    /**
     * Gets the value of the globaltradeitemnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGlobaltradeitemnumber() {
        return globaltradeitemnumber;
    }

    /**
     * Sets the value of the globaltradeitemnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGlobaltradeitemnumber(Long value) {
        this.globaltradeitemnumber = value;
    }

    /**
     * Gets the value of the casingtareweight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCasingtareweight() {
        return casingtareweight;
    }

    /**
     * Sets the value of the casingtareweight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCasingtareweight(BigDecimal value) {
        this.casingtareweight = value;
    }

    /**
     * Gets the value of the casingtareweightuom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasingtareweightuom() {
        return casingtareweightuom;
    }

    /**
     * Sets the value of the casingtareweightuom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasingtareweightuom(String value) {
        this.casingtareweightuom = value;
    }

    /**
     * Gets the value of the genericingredient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericingredient() {
        return genericingredient;
    }

    /**
     * Sets the value of the genericingredient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericingredient(String value) {
        this.genericingredient = value;
    }

    /**
     * Gets the value of the hasdisplayreadypackaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasdisplayreadypackaging() {
        return hasdisplayreadypackaging;
    }

    /**
     * Sets the value of the hasdisplayreadypackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasdisplayreadypackaging(String value) {
        this.hasdisplayreadypackaging = value;
    }

    /**
     * Gets the value of the ingredientstrength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientstrength() {
        return ingredientstrength;
    }

    /**
     * Sets the value of the ingredientstrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientstrength(String value) {
        this.ingredientstrength = value;
    }

    /**
     * Gets the value of the isnetcontentdeclarindicated property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsnetcontentdeclarindicated() {
        return isnetcontentdeclarindicated;
    }

    /**
     * Sets the value of the isnetcontentdeclarindicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsnetcontentdeclarindicated(Short value) {
        this.isnetcontentdeclarindicated = value;
    }

    /**
     * Gets the value of the layerheight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLayerheight() {
        return layerheight;
    }

    /**
     * Sets the value of the layerheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLayerheight(BigDecimal value) {
        this.layerheight = value;
    }

    /**
     * Gets the value of the layerheightuom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayerheightuom() {
        return layerheightuom;
    }

    /**
     * Sets the value of the layerheightuom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerheightuom(String value) {
        this.layerheightuom = value;
    }

    /**
     * Gets the value of the pricecomparisoncontenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricecomparisoncontenttype() {
        return pricecomparisoncontenttype;
    }

    /**
     * Sets the value of the pricecomparisoncontenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricecomparisoncontenttype(String value) {
        this.pricecomparisoncontenttype = value;
    }

    /**
     * Gets the value of the tpneutraltiinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Tpneutraltiinformation }
     *     
     */
    public Tpneutraltiinformation getTpneutraltiinformation() {
        return tpneutraltiinformation;
    }

    /**
     * Sets the value of the tpneutraltiinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tpneutraltiinformation }
     *     
     */
    public void setTpneutraltiinformation(Tpneutraltiinformation value) {
        this.tpneutraltiinformation = value;
    }

    /**
     * Gets the value of the diameterCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diameterCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiameterCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Diameter }
     * </p>
     * 
     * 
     * @return
     *     The value of the diameterCollection property.
     */
    public List<Diameter> getDiameterCollection() {
        if (diameterCollection == null) {
            diameterCollection = new ArrayList<>();
        }
        return this.diameterCollection;
    }

    /**
     * Gets the value of the grossweightCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossweightCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGrossweightCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grossweight }
     * </p>
     * 
     * 
     * @return
     *     The value of the grossweightCollection property.
     */
    public List<Grossweight> getGrossweightCollection() {
        if (grossweightCollection == null) {
            grossweightCollection = new ArrayList<>();
        }
        return this.grossweightCollection;
    }

    /**
     * Gets the value of the heightCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heightCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHeightCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Height }
     * </p>
     * 
     * 
     * @return
     *     The value of the heightCollection property.
     */
    public List<Height> getHeightCollection() {
        if (heightCollection == null) {
            heightCollection = new ArrayList<>();
        }
        return this.heightCollection;
    }

    /**
     * Gets the value of the netweightCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netweightCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetweightCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Netweight }
     * </p>
     * 
     * 
     * @return
     *     The value of the netweightCollection property.
     */
    public List<Netweight> getNetweightCollection() {
        if (netweightCollection == null) {
            netweightCollection = new ArrayList<>();
        }
        return this.netweightCollection;
    }

    /**
     * Gets the value of the depthCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depthCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDepthCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Depth }
     * </p>
     * 
     * 
     * @return
     *     The value of the depthCollection property.
     */
    public List<Depth> getDepthCollection() {
        if (depthCollection == null) {
            depthCollection = new ArrayList<>();
        }
        return this.depthCollection;
    }

    /**
     * Gets the value of the drainedweightCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drainedweightCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDrainedweightCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drainedweight }
     * </p>
     * 
     * 
     * @return
     *     The value of the drainedweightCollection property.
     */
    public List<Drainedweight> getDrainedweightCollection() {
        if (drainedweightCollection == null) {
            drainedweightCollection = new ArrayList<>();
        }
        return this.drainedweightCollection;
    }

    /**
     * Gets the value of the netcontentCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netcontentCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetcontentCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Netcontent }
     * </p>
     * 
     * 
     * @return
     *     The value of the netcontentCollection property.
     */
    public List<Netcontent> getNetcontentCollection() {
        if (netcontentCollection == null) {
            netcontentCollection = new ArrayList<>();
        }
        return this.netcontentCollection;
    }

    /**
     * Gets the value of the widthCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the widthCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWidthCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Width }
     * </p>
     * 
     * 
     * @return
     *     The value of the widthCollection property.
     */
    public List<Width> getWidthCollection() {
        if (widthCollection == null) {
            widthCollection = new ArrayList<>();
        }
        return this.widthCollection;
    }

}
