package com.lyrpx.dao;

import com.lyrpx.pojo.ISchool;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ISchoolMapper {
////    2.  查询出所有计算机学院开设的课程信息
//    @Select("select * from s_school where s_id=#{s_id} ")
//    @Results({@Result(id = true, column = "s_id", property = "s_id"),
//            @Result(column = "school_name", property = "school_name"),
//            @Result(column = "s_id", property = "courseList",
//                    many = @Many(select =
//                            "com.lyrpx.dao.ICourseMapper.selectSchool_CourseByCid"))})
//    ISchool selectSchoolById(int s_id);

//      5.  查询出所有的学院开设的课程信息
    @Select("select * from s_school where s_id=#{s_id} ")
    @Results({@Result(id = true, column = "s_id", property = "s_id"),
            @Result(column = "school_name", property = "school_name"),
            @Result(column = "s_id", property = "courseList",
                    many = @Many(select =
                            "com.lyrpx.dao.ICourseMapper.selectSchool_CourseByCid"))})
    ISchool selectSchoolById(int s_id);
}

