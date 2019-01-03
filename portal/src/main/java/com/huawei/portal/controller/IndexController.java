package com.huawei.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private InvokeService invokeService;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/count")
    public String count(String method) {
        return invokeService.invokeCounter(method, "/count");
    }

    @ResponseBody
    @GetMapping("/reset")
    public String reset(String method) {
        return invokeService.invokeCounter(method, "/reset");
    }

    @ResponseBody
    @GetMapping("/normal")
    public String normal(String method) {
        return invokeService.invokeCounter(method, "/normal");
    }

    @ResponseBody
    @GetMapping("/abnormal")
    public String abnormal(String method) {
        return invokeService.invokeCounter(method, "/abnormal");
    }
}