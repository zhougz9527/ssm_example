package com.springmvc.controller;

import com.springmvc.apiResult.Result;
import com.springmvc.apiResult.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Think
 * @Date: 2018/9/7
 * @Time: 1:18
 */
@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Result test() {
        return ResultUtil.succeedNoData();
    }

}
