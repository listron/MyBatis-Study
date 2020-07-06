package com.listron.dao;

import com.listron.pojo.User;
import com.listron.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test(){

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList=mapper.getUserList();

        for (User user:userList){
            System.out.print(user);
        }

        sqlSession.close();
    }

    @Test
    public void testUserById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User userById=mapper.getUserById(2);

        System.out.print(userById);

        sqlSession.close();
    }

    //所有的增删改，需要事务
    @Test
    public void testAddUser(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(5,"哈哈","123123"));
        //提交事务
        sqlSession.commit();
        //System.out.print(userById);

        sqlSession.close();
    }

    //所有的增删改，需要事务
    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

//        HashMap<String,Object> map = new HashMap<String, Object>();
//        map.put("id",4);
//        map.put("name","heyi");
//        map.put("pwd","132345");

        mapper.updateUser(new User(4,"uytre","67543"));
        //提交事务
        sqlSession.commit();
        //System.out.print(userById);

        sqlSession.close();
    }

    //所有的增删改，需要事务
    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);
        //提交事务
        sqlSession.commit();
        //System.out.print(userById);

        sqlSession.close();
    }

    //所有的增删改，需要事务
    @Test
    public void testGetUserLike(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("%wan%");
        //提交事务
        sqlSession.commit();
        for (User user:userList){
            System.out.print(user);
        }

        sqlSession.close();
    }

    @Test public void testLog4j(){
        logger.info("info:进入testLog4j");
        logger.debug("debug:进入testLog4j");
        logger.error("error:进入testLog4j");
    }

    @Test public void testGetUserByLimit(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("index",2);
        map.put("size",2);

        List<User> userList = mapper.getUserByLimit(map);
        //提交事务
        sqlSession.commit();
        for (User user:userList){
            System.out.print(user);
        }

        sqlSession.close();
    }
}
