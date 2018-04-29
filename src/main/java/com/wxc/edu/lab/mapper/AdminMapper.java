package com.wxc.edu.lab.mapper;

import com.wxc.edu.lab.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    Admin selectById(Long id);
}
