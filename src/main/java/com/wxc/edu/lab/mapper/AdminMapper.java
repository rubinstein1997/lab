package com.wxc.edu.lab.mapper;

import com.wxc.edu.lab.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AdminMapper {
    Admin selectById(Long id);
}
