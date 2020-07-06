package com.listron.dao;

import com.listron.pojo.Student;
import com.listron.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

//    @Select("select * from teacher where id=#{tid}")
    public List<Teacher>  getTeacher();

    public Teacher  getTeacherById(@Param("id") int id);

    public Teacher  getTeacherById2(@Param("id") int id);

}
