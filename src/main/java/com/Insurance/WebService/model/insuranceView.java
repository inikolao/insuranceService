package com.Insurance.WebService.model;

import generatedSources.Inquiry.nav.dynamics.microsoft.xmlports.webinquiry.WebInquiry;
import generatedSources.Inquiry.schemas.dynamics.microsoft.codeunit.webinquiry.GetInquiry;

public class insuranceView extends GetInquiry {

    public WebInquiry wbInquiry= getInsInquiry();
    public insuranceView() {
        wbInquiry.getContent();

    }


}
