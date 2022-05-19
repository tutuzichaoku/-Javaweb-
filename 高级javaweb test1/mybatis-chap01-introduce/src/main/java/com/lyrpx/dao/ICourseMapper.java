package com.lyrpx.dao;

import com.lyrpx.pojo.ICourse;
import org.apache.ibatis.annotations.Select;

public interface ICourseMapper {

//    1.  查询 id=2 的课程信息
   @Select("select * from c_course where c_id = #{c_id}")
   ICourse selectCourseByCid(int c_id);

////    2.  查询出所有计算机学院开设的课程信息
//    @Select("select * from c_course where schools = #{schools}")
//    @Results({@Result(id = true,column = "schools",property = "schools"),
//            @Result(column = "school_name",property = "school_name")
//    })
//    List<ICourse> selectSchool_CourseByCid(int schools);

////    3.  将 id=4 这⻔课程的课时数修改为 32+8=40
//    @Update("update c_course set hours=#{hours} " + "where c_id=#{c_id}")
//    int updateCourseByCId(ICourse c_course);

////    4.  插入一条新的课程记录： name=”大数据存储“，hours=32，schools =1
//    @Insert("Insert into c_course(c_id,name,hours,schools)" + "values(#{c_id},#{name},#{hours},#{schools})")
//    int insertCourse(ICourse c_course);

////    5.  输出所有的学院开设的课程信息
//    @Select("select * from c_course")
//    List<ICourse> selectAllCourse();
}
