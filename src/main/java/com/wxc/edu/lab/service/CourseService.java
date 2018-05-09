package com.wxc.edu.lab.service;

import com.wxc.edu.lab.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseService {

    private CourseMapper courseMapper;

    //时间段, 如0102节课
    private String[] segment = {"0102","0304","0506","0708","0910"};

    private String[] perday = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};

    @Autowired
    public CourseService(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    public List<Object> test() {

        //存储所有时间段的课程
        List<Object> perDayList = new ArrayList<>();

        //存储某一时间段的七天课程
        Map<String,Object> daySegment;

        //默认循环五次,因为有五个时间段
        for(int i = 1; i < 3; i ++) {


            daySegment = new LinkedHashMap<>();


            daySegment.put("id",segment[i-1]);

            //循环七次(天)
            for (int j = 1; j <= 7; j++) {

                daySegment.put(perday[j-1],courseMapper.select(String.valueOf(i * j)));
            }
            perDayList.add(daySegment);
        }
        return perDayList;
    }

}
