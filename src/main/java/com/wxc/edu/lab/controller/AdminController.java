package com.wxc.edu.lab.controller;


import com.wxc.edu.lab.domain.Admin;
import com.wxc.edu.lab.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

//    @ResponseBody
//    @RequestMapping("/Admin")
//    public Object admin(@RequestParam("id") Long id) {
//        return adminService.selectById(id);
//    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginForm(
            @RequestParam("id") String id,
            @RequestParam("passwd") String passwd,
            HttpSession httpSession,
            Model model) {
        Admin admin = adminService.login(id,passwd);
        if(admin != null) {
            httpSession.setAttribute("user_session",admin);
            return "redirect:/main";
        } else {
            model.addAttribute("message", "登录名或密码输入错误");
            return "forward:/login";
        }
    }

    @RequestMapping(value = "/main")
    public String main() {
        return "main";
    }
}
