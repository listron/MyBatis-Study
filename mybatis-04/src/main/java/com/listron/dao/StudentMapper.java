package com.listron.dao;

import com.listron.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
//    @Select("select  from student s,teacher t where s.tid=t.id")
 public List<Student> getStudent();

 public List<Student> getStudentByTeacherId(@Param("id") int id);
}
