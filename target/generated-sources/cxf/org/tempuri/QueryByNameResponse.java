
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
 *         &lt;element name="QueryByNameResult" type="{http://tempuri.org}QueryByName_DataSet"/&gt;
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
    "queryByNameResult"
})
@XmlRootElement(name = "QueryByNameResponse")
public class QueryByNameResponse {

    @XmlElement(name = "QueryByNameResult", required = true)
    protected QueryByNameDataSet queryByNameResult;

    /**
     * Obtiene el valor de la propiedad queryByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link QueryByNameDataSet }
     *     
     */
    public QueryByNameDataSet getQueryByNameResult() {
        return queryByNameResult;
    }

    /**
     * Define el valor de la propiedad queryByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryByNameDataSet }
     *     
     */
    public void setQueryByNameResult(QueryByNameDataSet value) {
        this.queryByNameResult = value;
    }

}
