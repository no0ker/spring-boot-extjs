package com.orcsoft.springbootextjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String root(Model model) {
        model.addAttribute("message", "AAAA");
        return "hello";
    }
}
