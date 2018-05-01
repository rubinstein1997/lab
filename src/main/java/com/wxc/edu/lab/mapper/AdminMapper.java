package com.wxc.edu.lab.mapper;

import com.wxc.edu.lab.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AdminMapper {
    Admin selectById(String id);

    Admin selectByIdAndPasswd(
            @Param("id") String id,
            @Param("passwd") String passwd);
}
