
package generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nav.dynamics.microsoft.xmlports.webinquiry package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebInquiry_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "WebInquiry");
    private final static QName _WebInquiryHeader_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "Header");
    private final static QName _WebInquiryVehicle_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "Vehicle");
    private final static QName _WebInquiryPackages_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "Packages");
    private final static QName _WebInquiryCovers_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "Covers");
    private final static QName _WebInquiryPackageCoversOptions_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "PackageCoversOptions");
    private final static QName _WebInquiryDiscCharges_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "DiscCharges");
    private final static QName _WebInquiryOwners_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "Owners");
    private final static QName _WebInquiryCustomFields_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "CustomFields");
    private final static QName _WebInquiryValueSplit_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/WebInquiry", "ValueSplit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nav.dynamics.microsoft.xmlports.webinquiry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebInquiry }
     * 
     */
    public WebInquiry createWebInquiry() {
        return new WebInquiry();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link Packages }
     * 
     */
    public Packages createPackages() {
        return new Packages();
    }

    /**
     * Create an instance of {@link Covers }
     * 
     */
    public Covers createCovers() {
        return new Covers();
    }

    /**
     * Create an instance of {@link PackageCoversOptions }
     * 
     */
    public PackageCoversOptions createPackageCoversOptions() {
        return new PackageCoversOptions();
    }

    /**
     * Create an instance of {@link DiscCharges }
     * 
     */
    public DiscCharges createDiscCharges() {
        return new DiscCharges();
    }

    /**
     * Create an instance of {@link Owners }
     * 
     */
    public Owners createOwners() {
        return new Owners();
    }

    /**
     * Create an instance of {@link CustomFields }
     * 
     */
    public CustomFields createCustomFields() {
        return new CustomFields();
    }

    /**
     * Create an instance of {@link ValueSplit }
     * 
     */
    public ValueSplit createValueSplit() {
        return new ValueSplit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebInquiry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebInquiry }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "WebInquiry")
    public JAXBElement<WebInquiry> createWebInquiry(WebInquiry value) {
        return new JAXBElement<WebInquiry>(_WebInquiry_QNAME, WebInquiry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Header }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "Header", scope = WebInquiry.class)
    public JAXBElement<Header> createWebInquiryHeader(Header value) {
        return new JAXBElement<Header>(_WebInquiryHeader_QNAME, Header.class, WebInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Vehicle }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "Vehicle", scope = WebInquiry.class)
    public JAXBElement<Vehicle> createWebInquiryVehicle(Vehicle value) {
        return new JAXBElement<Vehicle>(_WebInquiryVehicle_QNAME, Vehicle.class, WebInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Packages }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Packages }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "Packages", scope = WebInquiry.class)
    public JAXBElement<Packages> createWebInquiryPackages(Packages value) {
        return new JAXBElement<Packages>(_WebInquiryPackages_QNAME, Packages.class, WebInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Covers }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "Covers", scope = WebInquiry.class)
    public JAXBElement<Covers> createWebInquiryCovers(Covers value) {
        return new JAXBElement<Covers>(_WebInquiryCovers_QNAME, Covers.class, WebInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageCoversOptions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PackageCoversOptions }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "PackageCoversOptions", scope = WebInquiry.class)
    public JAXBElement<PackageCoversOptions> createWebInquiryPackageCoversOptions(PackageCoversOptions value) {
        return new JAXBElement<PackageCoversOptions>(_WebInquiryPackageCoversOptions_QNAME, PackageCoversOptions.class, WebInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscCharges }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiscCharges }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "DiscCharges", scope = WebInquiry.class)
    public JAXBElement<DiscCharges> createWebInquiryDiscCharges(DiscCharges value) {
        return new JAXBElement<DiscCharges>(_WebInquiryDiscCharges_QNAME, DiscCharges.class, WebInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Owners }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Owners }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "Owners", scope = WebInquiry.class)
    public JAXBElement<Owners> createWebInquiryOwners(Owners value) {
        return new JAXBElement<Owners>(_WebInquiryOwners_QNAME, Owners.class, WebInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFields }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomFields }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "CustomFields", scope = WebInquiry.class)
    public JAXBElement<CustomFields> createWebInquiryCustomFields(CustomFields value) {
        return new JAXBElement<CustomFields>(_WebInquiryCustomFields_QNAME, CustomFields.class, WebInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueSplit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValueSplit }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/WebInquiry", name = "ValueSplit", scope = WebInquiry.class)
    public JAXBElement<ValueSplit> createWebInquiryValueSplit(ValueSplit value) {
        return new JAXBElement<ValueSplit>(_WebInquiryValueSplit_QNAME, ValueSplit.class, WebInquiry.class, value);
    }

}
