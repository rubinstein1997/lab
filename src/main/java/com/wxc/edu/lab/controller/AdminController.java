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
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/main")
    public String main() {
        return "/admin/main";
    }
}
