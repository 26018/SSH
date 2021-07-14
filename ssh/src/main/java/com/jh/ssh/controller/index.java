package com.jh.ssh.controller;

import com.jh.ssh.domain.Result;
import com.jh.ssh.mapper.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
public class index {

    public static int times = 0;

    @Autowired
    Demo demo;

    @GetMapping("/st/{ques}")
    public Result getAns(@PathVariable String ques){
        times++;
        return new Result(200, "成功", demo.getAns(ques.trim()));
    }

    @GetMapping("/show")
    public int getReqTime() {
        return times;
    }

    @GetMapping("/reset")
    public int reset() {
        times = 0;
        return times;
    }

}
