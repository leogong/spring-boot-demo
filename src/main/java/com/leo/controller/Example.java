package com.leo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.leo.service.TagService;

@Controller
public class Example {

    @Resource
    private TagService tagService;

    // @RequestMapping("/{id}")
    // String home(@PathVariable("id") Long id) {
    // return JSON.toJSONString(tagService.get(id));
    // }

//    @RequestMapping("/")
//    public String welcome(Map<String, Object> model) {
//        model.put("time", new Date());
//        model.put("message", "hello message");
//        return "skins/finding/index.ftl";
//    }

}
