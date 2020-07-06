import com.listron.dao.StudentMapper;
import com.listron.dao.TeacherMapper;
import com.listron.pojo.Student;
import com.listron.pojo.Teacher;
import com.listron.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {

    @org.junit.Test
    public void testGetTeachersById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper mapper=sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher(1);
        System.out.print(teacher);

        sqlSession.close();
    }
    @org.junit.Test
    public void testGetStudents(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.print(student);
        }

        sqlSession.close();
    }

    @org.junit.Test
    public void testGetStudents2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudent2();
        for (Student student : students) {
            System.out.print(student);
        }

        sqlSession.close();
    }

}
