package com.leolsbufalo.moon.model;

import java.util.List;

public class ErrorResponse {

    private String message;
    private int code;
    private String status;
    private String objectName;
    private List<Error> errors;

    public ErrorResponse(String message, int code, String status, String objectName, List<Error> errors) {
        this.message = message;
        this.code = code;
        this.status = status;
        this.objectName = objectName;
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
