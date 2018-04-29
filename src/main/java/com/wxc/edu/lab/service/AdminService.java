package com.wxc.edu.lab.service;


import com.wxc.edu.lab.domain.Admin;
import com.wxc.edu.lab.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin selectById(Long id) {
        return adminMapper.selectById(id);
    }
}
