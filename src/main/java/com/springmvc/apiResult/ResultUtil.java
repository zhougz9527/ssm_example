package com.springmvc.apiResult;

/**
 *
 * 响应结果生成工具
 *
 * @Author: Think
 * @Date: 2018/5/15
 * @Time: 22:05
 */
public class ResultUtil {

    static int[] data = {};

    public static Result success(Object object) {
        Result result = new Result(0, ResultEnum.getMessageByCode(0), "success", object);
        return result;
    }

    public static Result succeedNoData() {
        return success(data);
    }

    public static Result error(int code) {
        String status = "failed";
        Result result = new Result(code, ResultEnum.getMessageByCode(code), status, data);
        return result;
    }

}
