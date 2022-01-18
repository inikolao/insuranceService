
package generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Field_No." type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Field_Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFields", propOrder = {
    "id",
    "fieldNo",
    "fieldValue"
})
public class CustomFields {

    @XmlElement(name = "ID", defaultValue = "0")
    protected int id;
    @XmlElement(name = "Field_No.", defaultValue = "0")
    protected int fieldNo;
    @XmlElement(name = "Field_Value", required = true)
    protected String fieldValue;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the fieldNo property.
     * 
     */
    public int getFieldNo() {
        return fieldNo;
    }

    /**
     * Sets the value of the fieldNo property.
     * 
     */
    public void setFieldNo(int value) {
        this.fieldNo = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

}
