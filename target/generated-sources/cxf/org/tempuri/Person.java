
package org.tempuri;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Person complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Home" type="{http://tempuri.org}Address" minOccurs="0"/&gt;
 *         &lt;element name="Office" type="{http://tempuri.org}Address" minOccurs="0"/&gt;
 *         &lt;element name="Spouse" type="{http://tempuri.org}Person" minOccurs="0"/&gt;
 *         &lt;element name="FavoriteColors" type="{http://tempuri.org}ArrayOfFavoriteColorsItemString" minOccurs="0"/&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "name",
    "ssn",
    "dob",
    "home",
    "office",
    "spouse",
    "favoriteColors",
    "age"
})
@XmlSeeAlso({
    Employee.class
})
public class Person {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SSN", required = true)
    protected String ssn;
    @XmlElement(name = "DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "Home")
    protected Address home;
    @XmlElement(name = "Office")
    protected Address office;
    @XmlElement(name = "Spouse")
    protected Person spouse;
    @XmlElement(name = "FavoriteColors")
    protected ArrayOfFavoriteColorsItemString favoriteColors;
    @XmlElement(name = "Age")
    protected Long age;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad ssn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Define el valor de la propiedad ssn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Obtiene el valor de la propiedad dob.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Define el valor de la propiedad dob.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Obtiene el valor de la propiedad home.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getHome() {
        return home;
    }

    /**
     * Define el valor de la propiedad home.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setHome(Address value) {
        this.home = value;
    }

    /**
     * Obtiene el valor de la propiedad office.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOffice() {
        return office;
    }

    /**
     * Define el valor de la propiedad office.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOffice(Address value) {
        this.office = value;
    }

    /**
     * Obtiene el valor de la propiedad spouse.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getSpouse() {
        return spouse;
    }

    /**
     * Define el valor de la propiedad spouse.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setSpouse(Person value) {
        this.spouse = value;
    }

    /**
     * Obtiene el valor de la propiedad favoriteColors.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFavoriteColorsItemString }
     *     
     */
    public ArrayOfFavoriteColorsItemString getFavoriteColors() {
        return favoriteColors;
    }

    /**
     * Define el valor de la propiedad favoriteColors.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFavoriteColorsItemString }
     *     
     */
    public void setFavoriteColors(ArrayOfFavoriteColorsItemString value) {
        this.favoriteColors = value;
    }

    /**
     * Obtiene el valor de la propiedad age.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAge() {
        return age;
    }

    /**
     * Define el valor de la propiedad age.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAge(Long value) {
        this.age = value;
    }

}
