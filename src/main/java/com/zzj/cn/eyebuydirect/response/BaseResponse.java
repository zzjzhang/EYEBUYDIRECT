package com.zzj.cn.eyebuydirect.response;

import com.zzj.cn.eyebuydirect.enums.Status;


public class BaseResponse<T> {

    private Status status;
    private String message;
    private T responseEntity;


    public BaseResponse success(T responseEntity) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatus(Status.SUCCESS);
        baseResponse.setResponseEntity(responseEntity);
        return baseResponse;
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
