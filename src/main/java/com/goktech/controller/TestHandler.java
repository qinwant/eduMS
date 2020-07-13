package com.goktech.controller;

import com.goktech.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kingwan on 2020/7/13.
 * 说明：该文件夹存放handler业务处理类
 */
@Controller
public class TestHandler {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String findAll(){
            String all = testService.findAll();
        return "test:"+all;
    }
}
