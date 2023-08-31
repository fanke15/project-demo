package com.gen.common.constants;

public enum RespCodeConstants {
    SUCCESS("200", "SUCCESS"),
    FAIL("000", "访问失败"),
    NETWORK("400", "网络繁忙"),
    NOTAUTH("401", "无权访问"),
    ;

    private String resultCode;
    private String resultMsg;

    private RespCodeConstants(String code, String msg) {
        this.resultCode = code;
        this.resultMsg = msg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public String getResultMsg(String language) {
        return null;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
