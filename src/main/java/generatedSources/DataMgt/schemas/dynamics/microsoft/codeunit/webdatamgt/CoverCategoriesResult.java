
package generatedSources.DataMgt.schemas.dynamics.microsoft.codeunit.webdatamgt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import generatedSources.DataMgt.nav.dynamics.microsoft.xmlports.tables.Root;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iTable" type="{urn:microsoft-dynamics-nav/xmlports/Tables}Root"/&gt;
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
    "iTable"
})
@XmlRootElement(name = "CoverCategories_Result")
public class CoverCategoriesResult {

    @XmlElement(required = true)
    protected Root iTable;

    /**
     * Gets the value of the iTable property.
     * 
     * @return
     *     possible object is
     *     {@link Root }
     *     
     */
    public Root getITable() {
        return iTable;
    }

    /**
     * Sets the value of the iTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Root }
     *     
     */
    public void setITable(Root value) {
        this.iTable = value;
    }

}
