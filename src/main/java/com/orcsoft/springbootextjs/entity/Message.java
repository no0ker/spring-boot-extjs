package com.orcsoft.springbootextjs.entity;

import java.text.MessageFormat;

public class Message {
    private String errorCode;
    private String errorMessage;

    public Message() {
    }

    public Message(ErrorCode errorCode){
        this.errorCode = String.valueOf(errorCode.getErrorCode());
        this.errorMessage = errorCode.getErrorMessage();
    }

    public Message(ErrorCode errorCode, Object ... args){
        this.errorCode = String.valueOf(errorCode.getErrorCode());
        this.errorMessage = MessageFormat.format(errorCode.getErrorMessage(), args);
    }

    public Message(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
