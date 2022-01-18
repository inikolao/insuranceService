
package generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageCoversOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageCoversOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cover_No." type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Insured_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Deductible_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageCoversOptions", propOrder = {
    "id",
    "coverNo",
    "insuredAmount",
    "deductibleAmount"
})
public class PackageCoversOptions {

    @XmlElement(name = "ID", defaultValue = "0")
    protected int id;
    @XmlElement(name = "Cover_No.", required = true)
    protected String coverNo;
    @XmlElement(name = "Insured_Amount", defaultValue = "0")
    protected BigDecimal insuredAmount;
    @XmlElement(name = "Deductible_Amount", defaultValue = "0")
    protected BigDecimal deductibleAmount;

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
     * Gets the value of the coverNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverNo() {
        return coverNo;
    }

    /**
     * Sets the value of the coverNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverNo(String value) {
        this.coverNo = value;
    }

    /**
     * Gets the value of the insuredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuredAmount() {
        return insuredAmount;
    }

    /**
     * Sets the value of the insuredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuredAmount(BigDecimal value) {
        this.insuredAmount = value;
    }

    /**
     * Gets the value of the deductibleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductibleAmount() {
        return deductibleAmount;
    }

    /**
     * Sets the value of the deductibleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductibleAmount(BigDecimal value) {
        this.deductibleAmount = value;
    }

}
