
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-01-18T00:49:54.656+02:00
 * Generated source version: 3.5.0
 *
 */

@javax.jws.WebService(
                      serviceName = "WebInquiry",
                      portName = "WebInquiry_Port",
                      targetNamespace = "urn:microsoft-dynamics-schemas/codeunit/WebInquiry",
                      wsdlLocation = "file:/D:/Ioannis/Documents/Projects/Code/Java/insuranceService/WSDLS/Statements/GetInquiry/GetInquiry.wsdl",
                      endpointInterface = "schemas.dynamics.microsoft.codeunit.webinquiry.WebInquiryPort")

public class WebInquiry_PortImpl implements WebInquiryPort {

    private static final Logger LOG = Logger.getLogger(WebInquiry_PortImpl.class.getName());

    /* (non-Javadoc)
     * @see schemas.dynamics.microsoft.codeunit.webinquiry.WebInquiryPort#getInquiry(nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry insInquiry)*
     */
    public void getInquiry(javax.xml.ws.Holder<generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry> insInquiry) {
        LOG.info("Executing operation getInquiry");
        System.out.println(insInquiry.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
