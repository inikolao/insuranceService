
package generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry;


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
 *         &lt;element name="insInquiry" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}WebInquiry"/&gt;
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
    "insInquiry"
})
@XmlRootElement(name = "GetInquiry_Result")
public class GetInquiryResult {

    @XmlElement(required = true)
    protected WebInquiry insInquiry;

    /**
     * Gets the value of the insInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link WebInquiry }
     *     
     */
    public WebInquiry getInsInquiry() {
        return insInquiry;
    }

    /**
     * Sets the value of the insInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebInquiry }
     *     
     */
    public void setInsInquiry(WebInquiry value) {
        this.insInquiry = value;
    }

}
