
package nav.dynamics.microsoft.xmlports.webinquiry;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueSplit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSplit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cover_Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Insured_Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Insurance_Units" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSplit", propOrder = {
    "coverCategory",
    "insuredValue",
    "insuranceUnits"
})
public class ValueSplit {

    @XmlElement(name = "Cover_Category")
    protected String coverCategory;
    @XmlElement(name = "Insured_Value", defaultValue = "0")
    protected BigDecimal insuredValue;
    @XmlElement(name = "Insurance_Units", defaultValue = "0")
    protected BigDecimal insuranceUnits;

    /**
     * Gets the value of the coverCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverCategory() {
        return coverCategory;
    }

    /**
     * Sets the value of the coverCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverCategory(String value) {
        this.coverCategory = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuredValue(BigDecimal value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the insuranceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuranceUnits() {
        return insuranceUnits;
    }

    /**
     * Sets the value of the insuranceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuranceUnits(BigDecimal value) {
        this.insuranceUnits = value;
    }

}
