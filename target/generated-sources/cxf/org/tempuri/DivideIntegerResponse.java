
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
 *         &lt;element name="DivideIntegerResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "divideIntegerResult"
})
@XmlRootElement(name = "DivideIntegerResponse")
public class DivideIntegerResponse {

    @XmlElement(name = "DivideIntegerResult")
    protected long divideIntegerResult;

    /**
     * Obtiene el valor de la propiedad divideIntegerResult.
     * 
     */
    public long getDivideIntegerResult() {
        return divideIntegerResult;
    }

    /**
     * Define el valor de la propiedad divideIntegerResult.
     * 
     */
    public void setDivideIntegerResult(long value) {
        this.divideIntegerResult = value;
    }

}
