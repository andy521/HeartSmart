package com.xqlh.heartsmart.bean;

/**
 * Created by Administrator on 2018/4/11.
 */

public class EntityCheckAccount {

    private  int code;
    private String msg;
    private boolean Result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isResult() {
        return Result;
    }

    public void setResult(boolean result) {
        Result = result;
    }
}
