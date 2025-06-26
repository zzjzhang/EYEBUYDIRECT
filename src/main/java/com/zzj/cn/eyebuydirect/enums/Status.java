package com.zzj.cn.eyebuydirect.enums;

public enum Status {

    SUCCESS("001", "SUCCESS"),
    FAIL("000", "FAIL");

    Status(String s, String success) {
    }

    private String code;
    private String value;

}
