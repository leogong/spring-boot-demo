package com.leo.controller;

import com.alibaba.fastjson.JSON;
import com.leo.service.TagService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Controller
public class Example {

    @Resource
    private TagService tagService;

    // @RequestMapping("/{id}")
    // String home(@PathVariable("id") Long id) {
    // return JSON.toJSONString(tagService.get(id));
    // }

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "hello message");
        return "welcome";
    }

}
