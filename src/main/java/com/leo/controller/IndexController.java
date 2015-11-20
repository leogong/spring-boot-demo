package com.leo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * IndexController Created by leo on 11/16/15.
 */
@Controller
public class IndexController {

    private @Autowired HttpServletRequest request;

    @SuppressWarnings("MVCPathVariableInspection")
    @RequestMapping(value = { "/", "/{page}" })
    public String index(@PathVariable Map<String, Integer> pathVariables, Map<String, Object> model) {
        Integer page = pathVariables.get("page");
        if (page == null || page <= 0) {
            page = 1;
        }
        model.put("blogTitle","blogTitle");
        model.put("year","1");
        return "skins/finding/index";
    }
}
