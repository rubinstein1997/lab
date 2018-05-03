package com.wxc.edu.lab.mapper;

import com.wxc.edu.lab.domain.Admin;
import com.wxc.edu.lab.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Mapper
@Component
public interface TeacherMapper {
    Teacher selectById(String id);

    Teacher selectByIdAndPasswd(
            @Param("id") String id,
            @Param("passwd") String passwd);
}
