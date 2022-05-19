package com.lyrpx.pojo;

import java.util.List;

public class ISchool {
    private Integer s_id;       // 主键id
    private String school_name;      // 学院名
    private List<ICourse> courseList;    // 学院课程集合

    public Integer getId() {
        return s_id;
    }

    public void setId(Integer s_id) {
        this.s_id = s_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public List<ICourse> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<ICourse> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "School{" +
                "s_id=" + s_id +
                ", school_name=" + school_name +
                ", courseList=" + courseList +'}';
    }
}