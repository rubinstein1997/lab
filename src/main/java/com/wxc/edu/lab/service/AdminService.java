package com.wxc.edu.lab.service;


import com.wxc.edu.lab.domain.Admin;
import com.wxc.edu.lab.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private AdminMapper adminMapper;

    @Autowired
    public AdminService(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public Admin selectById(String id) {
        return adminMapper.selectById(id);
    }

    public Admin login(String id, String passwd) {
        return adminMapper.selectByIdAndPasswd(id, passwd);
    }
}
