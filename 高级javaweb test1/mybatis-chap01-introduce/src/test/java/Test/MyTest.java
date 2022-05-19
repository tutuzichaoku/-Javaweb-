package Test;

import com.lyrpx.pojo.ICourse;
import com.lyrpx.dao.ICourseMapper;
import com.lyrpx.utils.MyTool;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
 //    1.  查询 id=2 的课程信息
 @Test
 public void selectCourseByCidTest() {
  // 1.通过工具类获取SqlSession对象
  SqlSession session = MyTool.getSqlSession();
  ICourseMapper mapper = session.getMapper(ICourseMapper.class);
  // 2.使用ICourseMapper对象查询id为2的的课程信息
  ICourse icourse = mapper.selectCourseByCid(2);
  System.out.println(icourse.toString());
  // 3.关闭SqlSession
  session.close();
 }

//    2.  查询出所有计算机学院开设的课程信息
//    @Test
//    public void selectSchoolByIdTest() {
//        // 1.通过工具类生成SqlSession对象
//        SqlSession session = MyTool.getSqlSession();
//        ISchoolMapper mapper = session.getMapper(ISchoolMapper.class);
//        // 2.查询id为1的学院中课程的信息
//        ISchool ischool = mapper.selectSchoolById(1);
//        System.out.println(ischool.toString());
//        session.close();
//    }

////    3.  将 id=4 这⻔课程的课时数修改为 32+8=40；
//    @Test
//    public void updateCourseByCidTest() {
//        ICourse c_course = new ICourse();
//        c_course.setId(4);
//        c_course.setHours(40);
//        // 1.通过工具类获取SqlSession对象
//        SqlSession session = MyTool.getSqlSession();
//        ICourseMapper mapper = session.getMapper(ICourseMapper.class);
//        // 2.修改id为4的的课程信息
//        int update = mapper.updateCourseByCId(c_course);
//        System.out.println(c_course.toString());
//        // 3.关闭SqlSession
//        session.close();
//    }

////    4.  插入一条新的课程记录： names=”大数据存储“，hours=32，schools =1
//    @Test
//    public void insertCourseTest() {
//        ICourse c_course = new ICourse();
//        c_course.setId(5);
//        c_course.setName("大数据存储");
//        c_course.setHours(32);
//        c_course.setSchools(1);
//        // 1.通过工具类获取SqlSession对象
//        SqlSession session = MyTool.getSqlSession();
//        ICourseMapper mapper = session.getMapper(ICourseMapper.class);
//        // 2.插入课程信息
//        int insert = mapper.insertCourse(c_course);
//        System.out.println(c_course.toString());
//        // 3.关闭SqlSession
//        session.close();
//    }

////    5.  输出所有的学院开设的课程信息
//    @Test
//    public void selectAllCourseTest() {
//        // 1.通过工具类生成SqlSession对象
//        SqlSession session = MyTool.getSqlSession();
//        ICourseMapper mapper = session.getMapper(ICourseMapper.class);
//        // 2.查询所有学院中课程的信息
//        List<ICourse> courseList = mapper.selectAllCourse();
//        System.out.println(courseList);
//        session.close();
//获取配置文件的数据流
public static void main(String[] args) throws IOException {
InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
 //创建SqlSessionFactory工厂
 SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
 //从工厂实例获取SqlSession实例
 SqlSession sqlSession = factory.openSession();
 //用SqlSession实例执行映射文件中配置的数据库操作，并输出结果
 List<User> users = sqlSession.selectList("selectAll"); //参数值为映射操作的id值
for (User user : users) {
 System.out.println(user);
 }
}
}

