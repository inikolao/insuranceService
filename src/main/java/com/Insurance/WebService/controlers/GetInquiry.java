package com.Insurance.WebService.controlers;

import com.Insurance.WebService.domain.NtmlAuthentication;
import com.Insurance.WebService.services.inquiryService;
import generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry;
import generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry.WebInquiryPort_WebInquiryPort_Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.Holder;

@Controller
public class GetInquiry  {


    //public final WebInquiryPort_WebInquiryPort_Client webInquiryPort_webInquiryPort_client=new WebInquiryPort_WebInquiryPort_Client("");

    //private String URL=webInquiryPort_webInquiryPort_client.


    private final NtmlAuthentication ntmlAuthentication=new NtmlAuthentication("INSNEMO\\ws","7E?E3gR9*FZd7D?p","INSNEMO","https://soap.insnemo.gr:7047/WS/ws/AIG_UAT/Codeunit/WebInquiry");

    @RequestMapping("/GetInquiry")
    public String getInq(String papaki) {
        return "hello";
    }



}
