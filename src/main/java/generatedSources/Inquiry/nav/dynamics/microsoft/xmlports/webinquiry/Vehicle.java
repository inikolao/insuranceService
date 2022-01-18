
package generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Vehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ins._Object_Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ins._Object_Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Power_hp" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Ins._Object_Type_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="License_No." type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Make_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Model_No." type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Model_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vehicle_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vehicle_Weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Initial_Registration_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Prod._Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="No._of_Seats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cylinder_Capacity_cc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Color_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Alarm_Immobilizer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Parking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Trailer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="No._Of_Trailers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Acquisition_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Convertible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fuel_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Emmissions_min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Emmissions_max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Acceleration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Engine_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Last_Technical_Inspection" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Next_Technical_Inspection" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Main_Driver_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Main_Driver_Date_of_Birth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Main_Driver_License_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Main_Driver_Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Main_Driver_City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "insObjectType",
    "insObjectValue",
    "powerHp",
    "insObjectTypeGroup",
    "licenseNo",
    "makeCode",
    "modelNo",
    "modelTypeCode",
    "vehicleType",
    "vehicleWeight",
    "initialRegistrationDate",
    "prodYear",
    "noOfSeats",
    "cylinderCapacityCc",
    "colorCode",
    "alarmImmobilizer",
    "parking",
    "trailer",
    "noOfTrailers",
    "acquisitionDate",
    "convertible",
    "fuelType",
    "emmissionsMin",
    "emmissionsMax",
    "acceleration",
    "engineType",
    "lastTechnicalInspection",
    "nextTechnicalInspection",
    "mainDriverName",
    "mainDriverDateOfBirth",
    "mainDriverLicenseDate",
    "mainDriverPostCode",
    "mainDriverCity"
})
public class Vehicle {

    @XmlElement(name = "Ins._Object_Type", required = true)
    protected String insObjectType;
    @XmlElement(name = "Ins._Object_Value", required = true, defaultValue = "0")
    protected BigDecimal insObjectValue;
    @XmlElement(name = "Power_hp", required = true, defaultValue = "0")
    protected BigDecimal powerHp;
    @XmlElement(name = "Ins._Object_Type_Group")
    protected String insObjectTypeGroup;
    @XmlElement(name = "License_No.")
    protected String licenseNo;
    @XmlElement(name = "Make_Code")
    protected String makeCode;
    @XmlElement(name = "Model_No.")
    protected String modelNo;
    @XmlElement(name = "Model_Type_Code")
    protected String modelTypeCode;
    @XmlElement(name = "Vehicle_Type")
    protected String vehicleType;
    @XmlElement(name = "Vehicle_Weight", defaultValue = "0")
    protected BigDecimal vehicleWeight;
    @XmlElement(name = "Initial_Registration_Date", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialRegistrationDate;
    @XmlElement(name = "Prod._Year", defaultValue = "0")
    protected Integer prodYear;
    @XmlElement(name = "No._of_Seats", defaultValue = "0")
    protected Integer noOfSeats;
    @XmlElement(name = "Cylinder_Capacity_cc", defaultValue = "0")
    protected BigDecimal cylinderCapacityCc;
    @XmlElement(name = "Color_Code")
    protected String colorCode;
    @XmlElement(name = "Alarm_Immobilizer", defaultValue = "false")
    protected Boolean alarmImmobilizer;
    @XmlElement(name = "Parking", defaultValue = "false")
    protected Boolean parking;
    @XmlElement(name = "Trailer")
    protected String trailer;
    @XmlElement(name = "No._Of_Trailers", defaultValue = "0")
    protected Integer noOfTrailers;
    @XmlElement(name = "Acquisition_Date", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acquisitionDate;
    @XmlElement(name = "Convertible")
    protected String convertible;
    @XmlElement(name = "Fuel_Type")
    protected String fuelType;
    @XmlElement(name = "Emmissions_min", defaultValue = "0")
    protected BigDecimal emmissionsMin;
    @XmlElement(name = "Emmissions_max", defaultValue = "0")
    protected BigDecimal emmissionsMax;
    @XmlElement(name = "Acceleration", defaultValue = "0")
    protected BigDecimal acceleration;
    @XmlElement(name = "Engine_Type")
    protected String engineType;
    @XmlElement(name = "Last_Technical_Inspection", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTechnicalInspection;
    @XmlElement(name = "Next_Technical_Inspection", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextTechnicalInspection;
    @XmlElement(name = "Main_Driver_Name")
    protected String mainDriverName;
    @XmlElement(name = "Main_Driver_Date_of_Birth", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mainDriverDateOfBirth;
    @XmlElement(name = "Main_Driver_License_Date", defaultValue = "0001-01-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mainDriverLicenseDate;
    @XmlElement(name = "Main_Driver_Post_Code")
    protected String mainDriverPostCode;
    @XmlElement(name = "Main_Driver_City")
    protected String mainDriverCity;

    /**
     * Gets the value of the insObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsObjectType() {
        return insObjectType;
    }

    /**
     * Sets the value of the insObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsObjectType(String value) {
        this.insObjectType = value;
    }

    /**
     * Gets the value of the insObjectValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsObjectValue() {
        return insObjectValue;
    }

    /**
     * Sets the value of the insObjectValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsObjectValue(BigDecimal value) {
        this.insObjectValue = value;
    }

    /**
     * Gets the value of the powerHp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPowerHp() {
        return powerHp;
    }

    /**
     * Sets the value of the powerHp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPowerHp(BigDecimal value) {
        this.powerHp = value;
    }

    /**
     * Gets the value of the insObjectTypeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsObjectTypeGroup() {
        return insObjectTypeGroup;
    }

    /**
     * Sets the value of the insObjectTypeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsObjectTypeGroup(String value) {
        this.insObjectTypeGroup = value;
    }

    /**
     * Gets the value of the licenseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * Sets the value of the licenseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNo(String value) {
        this.licenseNo = value;
    }

    /**
     * Gets the value of the makeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeCode() {
        return makeCode;
    }

    /**
     * Sets the value of the makeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeCode(String value) {
        this.makeCode = value;
    }

    /**
     * Gets the value of the modelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNo() {
        return modelNo;
    }

    /**
     * Sets the value of the modelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNo(String value) {
        this.modelNo = value;
    }

    /**
     * Gets the value of the modelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelTypeCode() {
        return modelTypeCode;
    }

    /**
     * Sets the value of the modelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelTypeCode(String value) {
        this.modelTypeCode = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVehicleWeight() {
        return vehicleWeight;
    }

    /**
     * Sets the value of the vehicleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVehicleWeight(BigDecimal value) {
        this.vehicleWeight = value;
    }

    /**
     * Gets the value of the initialRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialRegistrationDate() {
        return initialRegistrationDate;
    }

    /**
     * Sets the value of the initialRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialRegistrationDate(XMLGregorianCalendar value) {
        this.initialRegistrationDate = value;
    }

    /**
     * Gets the value of the prodYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProdYear() {
        return prodYear;
    }

    /**
     * Sets the value of the prodYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProdYear(Integer value) {
        this.prodYear = value;
    }

    /**
     * Gets the value of the noOfSeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    /**
     * Sets the value of the noOfSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfSeats(Integer value) {
        this.noOfSeats = value;
    }

    /**
     * Gets the value of the cylinderCapacityCc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCylinderCapacityCc() {
        return cylinderCapacityCc;
    }

    /**
     * Sets the value of the cylinderCapacityCc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCylinderCapacityCc(BigDecimal value) {
        this.cylinderCapacityCc = value;
    }

    /**
     * Gets the value of the colorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * Sets the value of the colorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCode(String value) {
        this.colorCode = value;
    }

    /**
     * Gets the value of the alarmImmobilizer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlarmImmobilizer() {
        return alarmImmobilizer;
    }

    /**
     * Sets the value of the alarmImmobilizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlarmImmobilizer(Boolean value) {
        this.alarmImmobilizer = value;
    }

    /**
     * Gets the value of the parking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParking() {
        return parking;
    }

    /**
     * Sets the value of the parking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParking(Boolean value) {
        this.parking = value;
    }

    /**
     * Gets the value of the trailer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailer() {
        return trailer;
    }

    /**
     * Sets the value of the trailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailer(String value) {
        this.trailer = value;
    }

    /**
     * Gets the value of the noOfTrailers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfTrailers() {
        return noOfTrailers;
    }

    /**
     * Sets the value of the noOfTrailers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfTrailers(Integer value) {
        this.noOfTrailers = value;
    }

    /**
     * Gets the value of the acquisitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquisitionDate() {
        return acquisitionDate;
    }

    /**
     * Sets the value of the acquisitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquisitionDate(XMLGregorianCalendar value) {
        this.acquisitionDate = value;
    }

    /**
     * Gets the value of the convertible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertible() {
        return convertible;
    }

    /**
     * Sets the value of the convertible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertible(String value) {
        this.convertible = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the emmissionsMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmmissionsMin() {
        return emmissionsMin;
    }

    /**
     * Sets the value of the emmissionsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmmissionsMin(BigDecimal value) {
        this.emmissionsMin = value;
    }

    /**
     * Gets the value of the emmissionsMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmmissionsMax() {
        return emmissionsMax;
    }

    /**
     * Sets the value of the emmissionsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmmissionsMax(BigDecimal value) {
        this.emmissionsMax = value;
    }

    /**
     * Gets the value of the acceleration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcceleration() {
        return acceleration;
    }

    /**
     * Sets the value of the acceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcceleration(BigDecimal value) {
        this.acceleration = value;
    }

    /**
     * Gets the value of the engineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * Sets the value of the engineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineType(String value) {
        this.engineType = value;
    }

    /**
     * Gets the value of the lastTechnicalInspection property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTechnicalInspection() {
        return lastTechnicalInspection;
    }

    /**
     * Sets the value of the lastTechnicalInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTechnicalInspection(XMLGregorianCalendar value) {
        this.lastTechnicalInspection = value;
    }

    /**
     * Gets the value of the nextTechnicalInspection property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextTechnicalInspection() {
        return nextTechnicalInspection;
    }

    /**
     * Sets the value of the nextTechnicalInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextTechnicalInspection(XMLGregorianCalendar value) {
        this.nextTechnicalInspection = value;
    }

    /**
     * Gets the value of the mainDriverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainDriverName() {
        return mainDriverName;
    }

    /**
     * Sets the value of the mainDriverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainDriverName(String value) {
        this.mainDriverName = value;
    }

    /**
     * Gets the value of the mainDriverDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMainDriverDateOfBirth() {
        return mainDriverDateOfBirth;
    }

    /**
     * Sets the value of the mainDriverDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMainDriverDateOfBirth(XMLGregorianCalendar value) {
        this.mainDriverDateOfBirth = value;
    }

    /**
     * Gets the value of the mainDriverLicenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMainDriverLicenseDate() {
        return mainDriverLicenseDate;
    }

    /**
     * Sets the value of the mainDriverLicenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMainDriverLicenseDate(XMLGregorianCalendar value) {
        this.mainDriverLicenseDate = value;
    }

    /**
     * Gets the value of the mainDriverPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainDriverPostCode() {
        return mainDriverPostCode;
    }

    /**
     * Sets the value of the mainDriverPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainDriverPostCode(String value) {
        this.mainDriverPostCode = value;
    }

    /**
     * Gets the value of the mainDriverCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainDriverCity() {
        return mainDriverCity;
    }

    /**
     * Sets the value of the mainDriverCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainDriverCity(String value) {
        this.mainDriverCity = value;
    }

}
