package com.wxc.edu.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @RequestMapping(value = "/main")
    public String main() {
        return "/teacher/main";
    }
}
