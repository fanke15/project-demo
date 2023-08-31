package com.gen.common.exception;

import com.gen.common.constants.RespCodeConstants;
import lombok.Data;

@Data
public class ApiException extends Exception{
    private String errorCode;
    private String errorMsg;

    public ApiException(RespCodeConstants codes) {
        super("errorCode=" + codes.getResultCode() + ", errorMsg=" + codes.getResultMsg());
        this.errorCode = codes.getResultCode();
        this.errorMsg =  codes.getResultMsg();
    }

    public ApiException(String errorCode, String errorMsg) {
        super("errorCode=" + errorCode + ", errorMsg=" + errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ApiException(RespCodeConstants codes, String errMsg) {
        super("errorCode=" + codes.getResultCode() + ", errorMsg=" + codes.getResultMsg());
        this.errorCode = codes.getResultCode();
        this.errorMsg = codes.getResultMsg() + errMsg;
    }

}
