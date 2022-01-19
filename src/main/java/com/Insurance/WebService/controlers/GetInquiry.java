package com.Insurance.WebService.controlers;

import com.Insurance.WebService.domain.NtmlAuthentication;
import com.Insurance.WebService.model.Playload;
import com.Insurance.WebService.model.insuranceView;
import generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.Header;
import generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.ObjectFactory;
import generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.Vehicle;
import generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry;
import generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry.WebInquiryPort;
import generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry.WebInquiryPort_WebInquiryPort_Client;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.validation.Validator;
import java.io.Serializable;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Controller
public class GetInquiry  {

    private static final QName SERVICE_NAME = new QName("urn:microsoft-dynamics-schemas/codeunit/WebInquiry", "WebInquiry");

    private final NtmlAuthentication ntmlAuthentication =new NtmlAuthentication("INSNEMO\\WSPR00000042","95M3tQeO0C1o","INSNEMO","https://soap.insnemo.gr:7047/WS/ws/AIG_UAT/Codeunit/WebInquiry");

    private Playload playload;
    private Exception ex;

    @PostMapping(value="/GetInquiry")
    @ResponseBody
    public Playload getInq(@RequestParam(value = "plate",required=true)String plate, @RequestParam(value = "date",required=true) Date date, @RequestParam(value = "postal",required=true)String postal ) {//@RequestParam(value = "world",required=true)String papa

        String message=null;
        // if(ntmlAuthentication.getStringAuthResponse().contains("401 Unauthorized"))
        // {
        message=ntmlAuthentication.getStringAuthResponse();
        //}



        URL wsdlURL = generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry.WebInquiry.WSDL_LOCATION;
        generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry.WebInquiry ss = new generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry.WebInquiry(wsdlURL, SERVICE_NAME);
        //ss.
        WebInquiryPort port = ss.getWebInquiryPort();
        {
            System.out.println("Invoking getInquiry...");
            // Set request context property.
            //java.util.Map<String, Object> requestContext = ((javax.xml.ws.BindingProvider)port).getRequestContext();
            //requestContext.put("", "License_No.");
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(date);
            XMLGregorianCalendar date2 =null;
            try {
                date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            } catch (DatatypeConfigurationException e) {
                ex=e;
            }

            ObjectFactory objectFactory = new ObjectFactory();
            //JAXBElement<String> jaxbElement =

            Vehicle vh=new Vehicle();
            vh.setLicenseNo(plate);
            JAXBElement<Vehicle> vehicleJAXBElement= objectFactory.createWebInquiryVehicle(vh);
            Header hd=new Header();
            hd.setCustomerPostCode(postal);
            hd.setStartDate(date2);
            JAXBElement<Header>  headerJAXBElement= objectFactory.createWebInquiryHeader(hd);
            WebInquiry webInquiry=new WebInquiry();
            JAXBElement<WebInquiry> webInquiryJAXBElement = objectFactory.createWebInquiry(webInquiry);

            webInquiry.getContent().add(headerJAXBElement);
            webInquiry.getContent().add(vehicleJAXBElement);
            //webInquiry.getContent().add(webInquiryJAXBElement);






// Invoke an operation.
            generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry _getInquiry_insInquiryVal = null;
            _getInquiry_insInquiryVal=webInquiry;
            javax.xml.ws.Holder<generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry> _getInquiry_insInquiry = new javax.xml.ws.Holder<generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry>(_getInquiry_insInquiryVal);//_getInquiry_insInquiryVal
            List<Serializable> test=_getInquiry_insInquiry.value.getContent();
            //List<Serializable> test2=_getInquiry_insInquiryVal.getContent();

           // test.add();

            try {
                port.getInquiry(_getInquiry_insInquiry);
            } catch (Exception e) {
                ex=e;
            }

          //  System.out.println("getInquiry._getInquiry_insInquiry=" + _getInquiry_insInquiry.value);

        }



        return new Playload(message,null,ex);


    }



}
