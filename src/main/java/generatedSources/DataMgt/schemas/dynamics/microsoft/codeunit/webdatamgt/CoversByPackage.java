
package generatedSources.DataMgt.schemas.dynamics.microsoft.codeunit.webdatamgt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import generatedSources.DataMgt.nav.dynamics.microsoft.xmlports.covers.Root;


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
 *         &lt;element name="iTable" type="{urn:microsoft-dynamics-nav/xmlports/Covers}Root"/&gt;
 *         &lt;element name="packageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insObjectTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insObjectTypeGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brokerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "iTable",
    "packageCode",
    "insObjectTypeCode",
    "insObjectTypeGroupCode",
    "brokerNo",
    "referenceDate"
})
@XmlRootElement(name = "CoversByPackage")
public class CoversByPackage {

    @XmlElement(required = true)
    protected Root iTable;
    @XmlElement(required = true)
    protected String packageCode;
    @XmlElement(required = true)
    protected String insObjectTypeCode;
    @XmlElement(required = true)
    protected String insObjectTypeGroupCode;
    @XmlElement(required = true)
    protected String brokerNo;
    @XmlElement(required = true)
    protected String referenceDate;

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

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCode(String value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the insObjectTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsObjectTypeCode() {
        return insObjectTypeCode;
    }

    /**
     * Sets the value of the insObjectTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsObjectTypeCode(String value) {
        this.insObjectTypeCode = value;
    }

    /**
     * Gets the value of the insObjectTypeGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsObjectTypeGroupCode() {
        return insObjectTypeGroupCode;
    }

    /**
     * Sets the value of the insObjectTypeGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsObjectTypeGroupCode(String value) {
        this.insObjectTypeGroupCode = value;
    }

    /**
     * Gets the value of the brokerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerNo() {
        return brokerNo;
    }

    /**
     * Sets the value of the brokerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerNo(String value) {
        this.brokerNo = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
        this.referenceDate = value;
    }

}
