package com.orcsoft.springbootextjs.entity;

public enum ErrorCode {
    DB_CREATE_OK(0L, "Entity has been saved. Its id is : {0}"),
    DB_CREATE_FAILED(100L, "Entity has NOT been saved. Original entity is : {0}");

    private Long errorCode;
    private String errorMessage;

    ErrorCode(Long errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
