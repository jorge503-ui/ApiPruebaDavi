
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
 *         &lt;element name="MissionResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "missionResult"
})
@XmlRootElement(name = "MissionResponse")
public class MissionResponse {

    @XmlElement(name = "MissionResult", required = true)
    protected String missionResult;

    /**
     * Obtiene el valor de la propiedad missionResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissionResult() {
        return missionResult;
    }

    /**
     * Define el valor de la propiedad missionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissionResult(String value) {
        this.missionResult = value;
    }

}
