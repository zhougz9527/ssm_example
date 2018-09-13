package com.springmvc.apiResult;

import java.io.Serializable;

/**
 *
 * 统一api相应结果封装
 *
 * @Author: Think
 * @Date: 2018/5/15
 * @Time: 21:59
 */
public class Result implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int code;
    private String msg;
    private String status;
    private Object result;

    public Result() {
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, String status) {
        this.code = code;
        this.msg = msg;
        this.status = status;
    }

    public Result(int code, String msg, String status, Object result) {
        this.code = code;
        this.msg = msg;
        this.status = status;
        this.result = result;
    }

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}
