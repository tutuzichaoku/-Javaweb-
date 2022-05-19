package java.com.popse.dao;

import com.popse.pojo.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description : TODO
 * @Author : PoPse
 * @Date : 2022/4/20 23:30
 * @Version : 1.0
 **/
public interface CourseMapper {

    /**
     * @Description: 根据课程名模糊查询课程信息列表 或 查询所有课程信息列表
     * @Param courseName:
     * @Return: java.util.ArrayList<com.popse.pojo.Course>
     **/
    public ArrayList<Course> findCourseByName(String courseName);

    /**
     * @Description: 查找id不为courseId但课程名为courseName的数据
     * @Param courseName:
     * @Return: java.util.ArrayList<com.popse.pojo.Course>
     **/
    public ArrayList<Course> findCourseByIdAndName(int courseId, String courseName);

    /**
     * @Description: 添加课程信息
     * @Param course:
     * @Return: int
     **/
    public int addCourse(Course course);

    /**
     * @Description: 更新课程信息
     * @Param course:
     * @Return: int
     **/
    public int updateCourse(Course course);

    /**
     * @Description: 删除课程信息
     * @Param courseId:
     * @Return: int
     **/
    public int deleteCourse(int courseId);

    /**
     * @Description: 添加课程图片
     * @Param courseId:
     * @Return: int
     **/
    public int addCourseImg(String courseImg, int courseId);

    /**
     * @Description: 删除课程图片
     * @Param courseId:
     * @Return: int
     **/
    public int deleteCourseImg(int courseId);

    /**
     * @Description: 更新课程图片
     * @Param courseId:
     * @Return: int
     **/
    public int updateCourseImg(String courseImg, int courseId);

    /**
     * @Description: 根据课程ID查找课程相关所有信息
     * @Param courseId:
     * @Return: java.util.Map<java.lang.String,java.lang.Object>
     **/
    public Map<String, Object> findCourseAndAcademyByCourseId(int courseId);

    /**
     * @Description: 返回所有课程信息
     * @Param : null
     * @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String, Object>> findCourseAndAcademyAll();

    /**
     * @Description: 根据课程名称模糊查询所有课程信息
     * @Param courseName:
     * @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    public List<Map<String, Object>> findCourseInfoByCourseName(String courseName);
}
