package com.wxc.edu.lab.controller;

import com.wxc.edu.lab.domain.Admin;
import com.wxc.edu.lab.domain.User;
import com.wxc.edu.lab.service.AdminService;
import com.wxc.edu.lab.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginForm(
            @RequestParam("id") String id,
            @RequestParam("passwd") String passwd,
            @RequestParam("role") String role,
            HttpSession httpSession,
            Model model) {

        User user = null;

        switch (role) {
            case "0":

                break;
            case "1":
                user = teacherService.login(id,passwd);
                user.setRole("teacher");
                break;
            case "2":
                user = adminService.login(id,passwd);
                user.setRole("admin");
                break;

        }

        if(user != null) {
            httpSession.setAttribute("user_session",user);
            return "redirect:/" + user.getRole() + "/main";
        } else {
            model.addAttribute("message", "登录名或密码输入错误");
            return "forward:/login";
        }

    }

    @Controller
    public class LogoutController {

        @RequestMapping(value="/logout",method = RequestMethod.GET)
        public String logout(HttpServletRequest request){
            HttpSession httpSession = request.getSession();
            httpSession.invalidate();
            return "redirect:/login";
        }

    }


}
