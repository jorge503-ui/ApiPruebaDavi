
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
 *         &lt;element name="AddIntegerResult" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "addIntegerResult"
})
@XmlRootElement(name = "AddIntegerResponse")
public class AddIntegerResponse {

    @XmlElement(name = "AddIntegerResult")
    protected long addIntegerResult;

    /**
     * Obtiene el valor de la propiedad addIntegerResult.
     * 
     */
    public long getAddIntegerResult() {
        return addIntegerResult;
    }

    /**
     * Define el valor de la propiedad addIntegerResult.
     * 
     */
    public void setAddIntegerResult(long value) {
        this.addIntegerResult = value;
    }

}
