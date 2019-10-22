package com.doing.test.domain;

import java.io.Serializable;

/**
 * @author doing
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 成功
     */
    public static final int SUCCESS = 0;

    /**
     * 系统错误
     */
    public static final int ERROR = -9999;

    /**
     * 目标返回对象
     */
    private T model;

    /**
     * 结果码
     */
    private int code;

    /**
     * 出错信息
     */
    private String message;

    public Result() {
        this(SUCCESS, null);
    }

    public Result(T model) {
        this(SUCCESS, null);
        this.model = model;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return code == SUCCESS;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setError(String message) {
        this.code = ERROR;
        this.message = message;
    }


    @Override
    public String toString() {
        return "Result [model=" + model + ", code=" + code + ", message=" + message + "]";
    }
}
