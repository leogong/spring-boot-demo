package com.leo.controller;

import com.alibaba.fastjson.JSON;
import com.leo.service.TagService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Example {

    @Resource
    private TagService tagService;

    @RequestMapping("/{id}")
    String home(@PathVariable("id") Long id) {
        return JSON.toJSONString(tagService.get(id));
    }

}
