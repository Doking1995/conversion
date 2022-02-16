package com.cuijh.conversion.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author v_jinhaocui
 * @Date 2022/2/16 13:55
 */
@RestController
@RequestMapping("/")
public class Test {


    @RequestMapping("/test")
    @ResponseBody
    public String helloWorld(){
        return "test";
    }
}