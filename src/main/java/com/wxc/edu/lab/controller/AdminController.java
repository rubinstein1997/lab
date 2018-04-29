package com.wxc.edu.lab.controller;


import com.wxc.edu.lab.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("/Admin")
    public Object admin(@RequestParam("id") Long id) {

        return adminService.selectById(id);
    }

}
