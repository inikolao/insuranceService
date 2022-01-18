
package generatedSources.DataMgt.nav.dynamics.microsoft.xmlports.covers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nav.dynamics.microsoft.xmlports.covers package. 
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

    private final static QName _Root_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/Covers", "Root");
    private final static QName _RootRecords_QNAME = new QName("urn:microsoft-dynamics-nav/xmlports/Covers", "Records");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nav.dynamics.microsoft.xmlports.covers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link Records }
     * 
     */
    public Records createRecords() {
        return new Records();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Root }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Root }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/Covers", name = "Root")
    public JAXBElement<Root> createRoot(Root value) {
        return new JAXBElement<Root>(_Root_QNAME, Root.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Records }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Records }{@code >}
     */
    @XmlElementDecl(namespace = "urn:microsoft-dynamics-nav/xmlports/Covers", name = "Records", scope = Root.class)
    public JAXBElement<Records> createRootRecords(Records value) {
        return new JAXBElement<Records>(_RootRecords_QNAME, Records.class, Root.class, value);
    }

}
