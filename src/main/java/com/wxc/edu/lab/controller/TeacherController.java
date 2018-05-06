package com.wxc.edu.lab.controller;

import com.wxc.edu.lab.domain.Js;
import com.wxc.edu.lab.domain.TeacherSchedule;
import org.omg.CORBA.Object;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    TeacherSchedule teacherSchedule = new TeacherSchedule();


    ArrayList<java.lang.Object> list = new ArrayList<>();




    @RequestMapping(value = "/main")
    public String main() {
        return "/teacher/main";
    }


    @ResponseBody
    @RequestMapping("/schedule")
    public Js schedule() {
        Js js = new Js();
        list.add(teacherSchedule);
        js.setData(list);
        return js;
    }

    @ResponseBody
    @RequestMapping("/test")
    public Map<String,String> test() {
        Map<String,String> map = new HashMap<>();
        map.put("mod","d");
        return map;
    }
}
