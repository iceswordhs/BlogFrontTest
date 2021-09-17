package com.hs.hsblog.utils;

import com.hs.hsblog.constant.CodeType;

import java.util.HashMap;

/**
 * @author Hs
 * @Date 2021/9/16 17:33
 * 前后端分离，使用Result类，返回JSON结果
 */
public class Result {
    /**
     * 成功为0
     * 各种错误为1
     */
    private static final int DEFAULT_STATUS_SUCCESS=0;
    private static final int DEFAULT_STATUS_FAIL=1;

    private static final String DEFAULT_STATUS_KEY="status";
    private static final String DEFAULT_MESSAGE_KEY="message";
    private static final String DEFAULT_DATA_KEY="data";

    private Result(){

    }

    public static ResultData success(){
        return build(DEFAULT_STATUS_KEY,DEFAULT_STATUS_SUCCESS);
    }

    public static ResultData success(Object code){
        return build(DEFAULT_STATUS_KEY,code);
    }

    public static ResultData success(String codeKey,Object code){
        return build(codeKey,code);
    }

    public static ResultData fail(){
        return build(DEFAULT_STATUS_KEY,DEFAULT_STATUS_FAIL);
    }

    public static ResultData fail(Object code){
        return build(DEFAULT_STATUS_KEY,code);
    }

    public static ResultData fail(String codeKey,Object code){
        return build(codeKey,code);
    }

    private static ResultData build(String key,CodeType value){
        ResultData resultData = new Result().new ResultData(3);
        resultData.put(key,((CodeType) value).getCode());
        resultData.put(DEFAULT_MESSAGE_KEY,((CodeType) value).getMessage());
        return resultData;
    }

    private static ResultData build(String key,Object value){
        ResultData resultData = new Result().new ResultData(3);
        resultData.put(key,value);
        return resultData;
    }

    public static ResultData build(){
        return new Result().new ResultData();
    }


    public class ResultData extends HashMap{
        private ResultData(){
        }

        private ResultData(int size){
            super(size);
        }

        public ResultData message(String messageKey,String message){
            this.put(messageKey,message);
            return this;
        }

        public ResultData message(String message){
            return message(DEFAULT_MESSAGE_KEY,message);
        }

        public ResultData data(String dateKey,Object data){
            this.put(dateKey,data);
            return this;
        }

        public ResultData data(Object data){
            return data(DEFAULT_DATA_KEY,data);
        }

        public ResultData add(String key,Object value){
            this.put(key,value);
            return this;
        }


    }
}
