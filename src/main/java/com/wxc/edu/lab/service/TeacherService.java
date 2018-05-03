package com.wxc.edu.lab.service;

import com.wxc.edu.lab.domain.Teacher;
import com.wxc.edu.lab.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private TeacherMapper teacherMapper;

    @Autowired
    public TeacherService(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    public Teacher selectById(String id) {
        return teacherMapper.selectById(id);
    }

    public Teacher login(String id, String passwd) {
        return teacherMapper.selectByIdAndPasswd(id, passwd);
    }
}
