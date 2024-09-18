
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
 *         &lt;element name="FindPersonResult" type="{http://tempuri.org}Person"/&gt;
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
    "findPersonResult"
})
@XmlRootElement(name = "FindPersonResponse")
public class FindPersonResponse {

    @XmlElement(name = "FindPersonResult", required = true)
    protected Person findPersonResult;

    /**
     * Obtiene el valor de la propiedad findPersonResult.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getFindPersonResult() {
        return findPersonResult;
    }

    /**
     * Define el valor de la propiedad findPersonResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setFindPersonResult(Person value) {
        this.findPersonResult = value;
    }

}
