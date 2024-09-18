
package org.tempuri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LookupCityResult" type="{http://tempuri.org}Address"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lookupCityResult"
})
@XmlRootElement(name = "LookupCityResponse")
public class LookupCityResponse {

    @XmlElement(name = "LookupCityResult", required = true)
    protected Address lookupCityResult;

    /**
     * Obtiene el valor de la propiedad lookupCityResult.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getLookupCityResult() {
        return lookupCityResult;
    }

    /**
     * Define el valor de la propiedad lookupCityResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setLookupCityResult(Address value) {
        this.lookupCityResult = value;
    }

}
