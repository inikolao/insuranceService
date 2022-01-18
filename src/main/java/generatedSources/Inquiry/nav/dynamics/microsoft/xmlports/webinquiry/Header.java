
package generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Header"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ins._Category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ins._Company_No." type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Broker_No." type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Customer_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Driver_Date_of_Birth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Driver_License_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Customer_Profession_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Customer_VAT_Registration_No." type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Customer_Disc_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Partner_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Package_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Package_Category_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "insCategory",
    "insCompanyNo",
    "brokerNo",
    "duration",
    "startDate",
    "endDate",
    "customerPostCode",
    "driverDateOfBirth",
    "driverLicenseDate",
    "customerProfessionCode",
    "customerVATRegistrationNo",
    "customerDiscGroup",
    "partnerType",
    "packageCode",
    "packageCategoryCode"
})
public class Header {

    @XmlElement(name = "Ins._Category", required = true)
    protected String insCategory;
    @XmlElement(name = "Ins._Company_No.", required = true)
    protected String insCompanyNo;
    @XmlElement(name = "Broker_No.")
    protected String brokerNo;
    @XmlElement(name = "Duration", required = true)
    protected String duration;
    @XmlElement(name = "Start_Date", required = true, defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Customer_Post_Code", required = true)
    protected String customerPostCode;
    @XmlElement(name = "Driver_Date_of_Birth", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar driverDateOfBirth;
    @XmlElement(name = "Driver_License_Date", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar driverLicenseDate;
    @XmlElement(name = "Customer_Profession_Code")
    protected String customerProfessionCode;
    @XmlElement(name = "Customer_VAT_Registration_No.")
    protected String customerVATRegistrationNo;
    @XmlElement(name = "Customer_Disc_Group")
    protected String customerDiscGroup;
    @XmlElement(name = "Partner_Type")
    protected String partnerType;
    @XmlElement(name = "Package_Code")
    protected String packageCode;
    @XmlElement(name = "Package_Category_Code")
    protected String packageCategoryCode;

    /**
     * Gets the value of the insCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsCategory() {
        return insCategory;
    }

    /**
     * Sets the value of the insCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsCategory(String value) {
        this.insCategory = value;
    }

    /**
     * Gets the value of the insCompanyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsCompanyNo() {
        return insCompanyNo;
    }

    /**
     * Sets the value of the insCompanyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsCompanyNo(String value) {
        this.insCompanyNo = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the customerPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPostCode() {
        return customerPostCode;
    }

    /**
     * Sets the value of the customerPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPostCode(String value) {
        this.customerPostCode = value;
    }

    /**
     * Gets the value of the driverDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDriverDateOfBirth() {
        return driverDateOfBirth;
    }

    /**
     * Sets the value of the driverDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDriverDateOfBirth(XMLGregorianCalendar value) {
        this.driverDateOfBirth = value;
    }

    /**
     * Gets the value of the driverLicenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDriverLicenseDate() {
        return driverLicenseDate;
    }

    /**
     * Sets the value of the driverLicenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDriverLicenseDate(XMLGregorianCalendar value) {
        this.driverLicenseDate = value;
    }

    /**
     * Gets the value of the customerProfessionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProfessionCode() {
        return customerProfessionCode;
    }

    /**
     * Sets the value of the customerProfessionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProfessionCode(String value) {
        this.customerProfessionCode = value;
    }

    /**
     * Gets the value of the customerVATRegistrationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerVATRegistrationNo() {
        return customerVATRegistrationNo;
    }

    /**
     * Sets the value of the customerVATRegistrationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerVATRegistrationNo(String value) {
        this.customerVATRegistrationNo = value;
    }

    /**
     * Gets the value of the customerDiscGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscGroup() {
        return customerDiscGroup;
    }

    /**
     * Sets the value of the customerDiscGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscGroup(String value) {
        this.customerDiscGroup = value;
    }

    /**
     * Gets the value of the partnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * Sets the value of the partnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerType(String value) {
        this.partnerType = value;
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
     * Gets the value of the packageCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCategoryCode() {
        return packageCategoryCode;
    }

    /**
     * Sets the value of the packageCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCategoryCode(String value) {
        this.packageCategoryCode = value;
    }

}
