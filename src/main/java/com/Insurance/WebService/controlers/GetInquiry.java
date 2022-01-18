package com.Insurance.WebService.controlers;

import com.Insurance.WebService.services.inquiryService;
import generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry;
import org.springframework.stereotype.Controller;

import javax.xml.ws.Holder;

@Controller
public class GetInquiry implements inquiryService {

    @Override
    public void getInquiry(Holder<WebInquiry> insInquiry) {

    }
}
