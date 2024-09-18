
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
 *         &lt;element name="GetDataSetByNameResult" type="{http://tempuri.org}ByNameDataSet"/&gt;
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
    "getDataSetByNameResult"
})
@XmlRootElement(name = "GetDataSetByNameResponse")
public class GetDataSetByNameResponse {

    @XmlElement(name = "GetDataSetByNameResult", required = true)
    protected ByNameDataSet getDataSetByNameResult;

    /**
     * Obtiene el valor de la propiedad getDataSetByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ByNameDataSet }
     *     
     */
    public ByNameDataSet getGetDataSetByNameResult() {
        return getDataSetByNameResult;
    }

    /**
     * Define el valor de la propiedad getDataSetByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ByNameDataSet }
     *     
     */
    public void setGetDataSetByNameResult(ByNameDataSet value) {
        this.getDataSetByNameResult = value;
    }

}
