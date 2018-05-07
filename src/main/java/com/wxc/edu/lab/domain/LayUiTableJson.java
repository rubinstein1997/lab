package com.wxc.edu.lab.domain;

public class LayUiTableJson {

    private String code;

    private String msg;

    private String count;

    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LayUiTableJson{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", count='" + count + '\'' +
                ", data=" + data +
                '}';
    }
}
