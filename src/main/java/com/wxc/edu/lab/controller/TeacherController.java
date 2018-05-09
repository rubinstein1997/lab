package com.wxc.edu.lab.controller;

import com.wxc.edu.lab.domain.LayUiTableJson;
import com.wxc.edu.lab.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
public class TeacherController {


    @Autowired
    CourseService courseService;

    ArrayList<java.lang.Object> list = new ArrayList<>();




    @RequestMapping(value = "/main")
    public String main() {
        return "/teacher/main";
    }


    @ResponseBody
    @RequestMapping("/schedule")
    public Object schedule() {
        LayUiTableJson layUiTableJson = new LayUiTableJson();
        layUiTableJson.setCode("0");

        layUiTableJson.setData(courseService.test());

        return layUiTableJson;
    }

    @ResponseBody
    @RequestMapping("/test")
    public Map<String,String> test() {
        Map<String,String> map = new HashMap<>();
        map.put("mod","d");
        return map;
    }
}
