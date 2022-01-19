package com.Insurance.WebService.model;

public class Playload {

    private String Message;
    private insuranceView insuranceView;
    private Exception Exception;

    public Playload(String message, com.Insurance.WebService.model.insuranceView insuranceView, java.lang.Exception exception) {
        Message = message;
        this.insuranceView = insuranceView;
        Exception = exception;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public com.Insurance.WebService.model.insuranceView getInsuranceView() {
        return insuranceView;
    }

    public void setInsuranceView(com.Insurance.WebService.model.insuranceView insuranceView) {
        this.insuranceView = insuranceView;
    }

    public java.lang.Exception getException() {
        return Exception;
    }

    public void setException(java.lang.Exception exception) {
        Exception = exception;
    }
}
