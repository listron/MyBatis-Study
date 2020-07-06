package com.listron.dao;

import com.listron.pojo.User;
import com.listron.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    @Test
    public void testGetUsers(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUsers();
        for (User user:userList){
            System.out.print(user);
        }

        sqlSession.close();
    }


}
