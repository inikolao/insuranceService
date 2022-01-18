
package nav.dynamics.microsoft.xmlports.webinquiry;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebInquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebInquiry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}Header"/&gt;
 *         &lt;element name="Vehicle" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}Vehicle"/&gt;
 *         &lt;element name="Packages" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}Packages" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Covers" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}Covers" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackageCoversOptions" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}PackageCoversOptions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DiscCharges" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}DiscCharges" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Owners" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}Owners" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomFields" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}CustomFields" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ValueSplit" type="{urn:microsoft-dynamics-nav/xmlports/WebInquiry}ValueSplit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebInquiry", propOrder = {
    "content"
})
public class WebInquiry {

    @XmlElementRefs({
        @XmlElementRef(name = "Header", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class),
        @XmlElementRef(name = "Vehicle", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class),
        @XmlElementRef(name = "Packages", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class),
        @XmlElementRef(name = "Covers", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class),
        @XmlElementRef(name = "PackageCoversOptions", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class),
        @XmlElementRef(name = "DiscCharges", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class),
        @XmlElementRef(name = "Owners", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class),
        @XmlElementRef(name = "CustomFields", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class),
        @XmlElementRef(name = "ValueSplit", namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Covers }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomFields }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscCharges }{@code >}
     * {@link JAXBElement }{@code <}{@link Header }{@code >}
     * {@link JAXBElement }{@code <}{@link Owners }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageCoversOptions }{@code >}
     * {@link JAXBElement }{@code <}{@link Packages }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueSplit }{@code >}
     * {@link JAXBElement }{@code <}{@link Vehicle }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
