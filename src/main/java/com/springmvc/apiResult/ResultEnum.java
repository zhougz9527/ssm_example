package com.springmvc.apiResult;

/**
 *
 * 响应码枚举
 *
 * @Author: Think
 * @Date: 2018/5/15
 * @Time: 22:01
 */
public enum ResultEnum {

    SUCCESS(0, ""),
    SERVER_ERROR(1000, "服务器错误");

    public int code;
    public String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code获取message的值
     * @param code
     * @return
     */
    public static String getMessageByCode(int code) {
        for (ResultEnum resultEnum : ResultEnum.values()) {
            if (resultEnum.code == code) {
                return resultEnum.msg;
            }
        }
        return null;
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
}
