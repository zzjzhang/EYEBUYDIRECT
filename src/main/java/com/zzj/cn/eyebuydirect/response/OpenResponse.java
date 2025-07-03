package com.zzj.cn.eyebuydirect.response;

import com.zzj.cn.eyebuydirect.enums.Status;


public class OpenResponse<T> {

    private Status status;
    private String message;
    private T responseEntity;


    public static <T> OpenResponse success() {
        OpenResponse<T> openResponse = new OpenResponse<>();
        openResponse.setStatus(Status.SUCCESS);
        return openResponse;
    }

    public static <T> OpenResponse success(T responseEntity) {
        OpenResponse<T> openResponse = new OpenResponse<>();
        openResponse.setStatus(Status.SUCCESS);
        openResponse.setResponseEntity(responseEntity);
        return openResponse;
    }

    public static OpenResponse fail(String message) {
        OpenResponse openResponse = new OpenResponse();
        openResponse.setStatus(Status.FAIL);
        openResponse.setMessage(message);
        return openResponse;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResponseEntity() {
        return responseEntity;
    }

    public void setResponseEntity(T responseEntity) {
        this.responseEntity = responseEntity;
    }

}
