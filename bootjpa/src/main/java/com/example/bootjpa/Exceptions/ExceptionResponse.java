package com.example.bootjpa.Exceptions;

import java.util.Date;

public class ExceptionResponse {
    private Date timestamp;
    private String msg;
    private String desc;

    @Override
    public String toString() {
        return "ExceptionResponse{" +
                "timestamp=" + timestamp +
                ", msg='" + msg + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ExceptionResponse(Date timestamp, String msg, String desc) {
        this.timestamp = timestamp;
        this.msg = msg;
        this.desc = desc;
    }
}
