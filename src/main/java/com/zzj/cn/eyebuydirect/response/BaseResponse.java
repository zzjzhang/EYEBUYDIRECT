package com.zzj.cn.eyebuydirect.response;

import com.zzj.cn.eyebuydirect.enums.Status;


public class BaseResponse<T> {

    private Status status;
    private String message;
    private T responseEntity;


    public static <T> BaseResponse success() {
        BaseResponse<T> baseResponse = new BaseResponse<>();
        baseResponse.setStatus(Status.SUCCESS);
        return baseResponse;
    }

    public static <T> BaseResponse success(T responseEntity) {
        BaseResponse<T> baseResponse = new BaseResponse<>();
        baseResponse.setStatus(Status.SUCCESS);
        baseResponse.setResponseEntity(responseEntity);
        return baseResponse;
    }

    public static BaseResponse fail(String message) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatus(Status.FAIL);
        baseResponse.setMessage(message);
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
