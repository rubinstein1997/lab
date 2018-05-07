package com.wxc.edu.lab.mapper;

import com.wxc.edu.lab.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CourseMapper {

    Course select(String id);



}
