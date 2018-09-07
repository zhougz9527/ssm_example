package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Think
 * @Date: 2018/9/7
 * @Time: 1:18
 */
@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public  String index() {
        return "index";
    }

}
