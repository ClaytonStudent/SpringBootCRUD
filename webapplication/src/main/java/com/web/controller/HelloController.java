package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){return "Hello World";}

    @RequestMapping("/bar")
    public String bar(){return "bar";}

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("success", "<h1>SUCCESS ALWAYS!!!!</h1>");
        map.put("name", Arrays.asList("Wan qian", "Lan Yingying", "Huang Ling"));
        return "Success";
    }


    @RequestMapping("/dashboard")
    public String  dashboard(){return "dashboard";}


}
