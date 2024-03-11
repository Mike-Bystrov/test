
package wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for packagingmarking complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="packagingmarking">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ispackagingmarkedreturnable" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         <element name="ispckgmarkedwithingredients" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         <element name="ispriceonpack" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         <element name="offeronpack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pckgmarkedrecyclablescheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="packagemarksdietallergenCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarksdietallergen" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="pckgmarkedexpirationdatetypeCollection" type="{http://globalservice.ws.bept.ids.by/}pckgmarkedexpirationdatetype" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="tpneutraltiinformation" type="{http://globalservice.ws.bept.ids.by/}tpneutraltiinformation" minOccurs="0"/>
 *         <element name="packagemarkshygienicCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarkshygienic" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="packagemarksethicalCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarksethical" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="packagemarksfreefromCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarksfreefrom" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="packagemarksenvironmentCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarksenvironment" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packagingmarking", propOrder = {
    "globaltradeitemnumber",
    "ispackagingmarkedreturnable",
    "ispckgmarkedwithingredients",
    "ispriceonpack",
    "offeronpack",
    "pckgmarkedrecyclablescheme",
    "packagemarksdietallergenCollection",
    "pckgmarkedexpirationdatetypeCollection",
    "tpneutraltiinformation",
    "packagemarkshygienicCollection",
    "packagemarksethicalCollection",
    "packagemarksfreefromCollection",
    "packagemarksenvironmentCollection"
})
public class Packagingmarking {

    protected Long globaltradeitemnumber;
    protected Short ispackagingmarkedreturnable;
    protected Short ispckgmarkedwithingredients;
    protected Short ispriceonpack;
    protected String offeronpack;
    protected String pckgmarkedrecyclablescheme;
    @XmlElement(nillable = true)
    protected List<Packagemarksdietallergen> packagemarksdietallergenCollection;
    @XmlElement(nillable = true)
    protected List<Pckgmarkedexpirationdatetype> pckgmarkedexpirationdatetypeCollection;
    protected Tpneutraltiinformation tpneutraltiinformation;
    @XmlElement(nillable = true)
    protected List<Packagemarkshygienic> packagemarkshygienicCollection;
    @XmlElement(nillable = true)
    protected List<Packagemarksethical> packagemarksethicalCollection;
    @XmlElement(nillable = true)
    protected List<Packagemarksfreefrom> packagemarksfreefromCollection;
    @XmlElement(nillable = true)
    protected List<Packagemarksenvironment> packagemarksenvironmentCollection;

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
     * Gets the value of the ispackagingmarkedreturnable property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIspackagingmarkedreturnable() {
        return ispackagingmarkedreturnable;
    }

    /**
     * Sets the value of the ispackagingmarkedreturnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIspackagingmarkedreturnable(Short value) {
        this.ispackagingmarkedreturnable = value;
    }

    /**
     * Gets the value of the ispckgmarkedwithingredients property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIspckgmarkedwithingredients() {
        return ispckgmarkedwithingredients;
    }

    /**
     * Sets the value of the ispckgmarkedwithingredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIspckgmarkedwithingredients(Short value) {
        this.ispckgmarkedwithingredients = value;
    }

    /**
     * Gets the value of the ispriceonpack property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIspriceonpack() {
        return ispriceonpack;
    }

    /**
     * Sets the value of the ispriceonpack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIspriceonpack(Short value) {
        this.ispriceonpack = value;
    }

    /**
     * Gets the value of the offeronpack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferonpack() {
        return offeronpack;
    }

    /**
     * Sets the value of the offeronpack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferonpack(String value) {
        this.offeronpack = value;
    }

    /**
     * Gets the value of the pckgmarkedrecyclablescheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPckgmarkedrecyclablescheme() {
        return pckgmarkedrecyclablescheme;
    }

    /**
     * Sets the value of the pckgmarkedrecyclablescheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPckgmarkedrecyclablescheme(String value) {
        this.pckgmarkedrecyclablescheme = value;
    }

    /**
     * Gets the value of the packagemarksdietallergenCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarksdietallergenCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPackagemarksdietallergenCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarksdietallergen }
     * </p>
     * 
     * 
     * @return
     *     The value of the packagemarksdietallergenCollection property.
     */
    public List<Packagemarksdietallergen> getPackagemarksdietallergenCollection() {
        if (packagemarksdietallergenCollection == null) {
            packagemarksdietallergenCollection = new ArrayList<>();
        }
        return this.packagemarksdietallergenCollection;
    }

    /**
     * Gets the value of the pckgmarkedexpirationdatetypeCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pckgmarkedexpirationdatetypeCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPckgmarkedexpirationdatetypeCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pckgmarkedexpirationdatetype }
     * </p>
     * 
     * 
     * @return
     *     The value of the pckgmarkedexpirationdatetypeCollection property.
     */
    public List<Pckgmarkedexpirationdatetype> getPckgmarkedexpirationdatetypeCollection() {
        if (pckgmarkedexpirationdatetypeCollection == null) {
            pckgmarkedexpirationdatetypeCollection = new ArrayList<>();
        }
        return this.pckgmarkedexpirationdatetypeCollection;
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
     * Gets the value of the packagemarkshygienicCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarkshygienicCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPackagemarkshygienicCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarkshygienic }
     * </p>
     * 
     * 
     * @return
     *     The value of the packagemarkshygienicCollection property.
     */
    public List<Packagemarkshygienic> getPackagemarkshygienicCollection() {
        if (packagemarkshygienicCollection == null) {
            packagemarkshygienicCollection = new ArrayList<>();
        }
        return this.packagemarkshygienicCollection;
    }

    /**
     * Gets the value of the packagemarksethicalCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarksethicalCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPackagemarksethicalCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarksethical }
     * </p>
     * 
     * 
     * @return
     *     The value of the packagemarksethicalCollection property.
     */
    public List<Packagemarksethical> getPackagemarksethicalCollection() {
        if (packagemarksethicalCollection == null) {
            packagemarksethicalCollection = new ArrayList<>();
        }
        return this.packagemarksethicalCollection;
    }

    /**
     * Gets the value of the packagemarksfreefromCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarksfreefromCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPackagemarksfreefromCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarksfreefrom }
     * </p>
     * 
     * 
     * @return
     *     The value of the packagemarksfreefromCollection property.
     */
    public List<Packagemarksfreefrom> getPackagemarksfreefromCollection() {
        if (packagemarksfreefromCollection == null) {
            packagemarksfreefromCollection = new ArrayList<>();
        }
        return this.packagemarksfreefromCollection;
    }

    /**
     * Gets the value of the packagemarksenvironmentCollection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarksenvironmentCollection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPackagemarksenvironmentCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarksenvironment }
     * </p>
     * 
     * 
     * @return
     *     The value of the packagemarksenvironmentCollection property.
     */
    public List<Packagemarksenvironment> getPackagemarksenvironmentCollection() {
        if (packagemarksenvironmentCollection == null) {
            packagemarksenvironmentCollection = new ArrayList<>();
        }
        return this.packagemarksenvironmentCollection;
    }

}
