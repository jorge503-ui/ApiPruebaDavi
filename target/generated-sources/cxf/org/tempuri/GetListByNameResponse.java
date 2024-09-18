
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
 *         &lt;element name="GetListByNameResult" type="{http://tempuri.org}ArrayOfPersonIdentificationPersonIdentification"/&gt;
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
    "getListByNameResult"
})
@XmlRootElement(name = "GetListByNameResponse")
public class GetListByNameResponse {

    @XmlElement(name = "GetListByNameResult", required = true)
    protected ArrayOfPersonIdentificationPersonIdentification getListByNameResult;

    /**
     * Obtiene el valor de la propiedad getListByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonIdentificationPersonIdentification }
     *     
     */
    public ArrayOfPersonIdentificationPersonIdentification getGetListByNameResult() {
        return getListByNameResult;
    }

    /**
     * Define el valor de la propiedad getListByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonIdentificationPersonIdentification }
     *     
     */
    public void setGetListByNameResult(ArrayOfPersonIdentificationPersonIdentification value) {
        this.getListByNameResult = value;
    }

}
