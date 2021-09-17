package com.hs.hsblog.constant;

/**
 * @author Hs
 * @Date 2021/9/16 17:17
 * 状态返回码
 */
public enum CodeType {
    /**
     * 状态码
     */
    SUCCESS_STATUS(200,"success"),
    NETWORK_ANOMALY(500,"网络异常");

    private int code;

    private String message;

    /**
     * 枚举类的构造方法  被强制为私有
     * @param code
     * @param message
     */
    CodeType(int code,String message){
        this.code=code;
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
