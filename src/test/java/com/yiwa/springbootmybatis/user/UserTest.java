package com.yiwa.springbootmybatis.user;


import com.yiwa.springbootmybatis.SpringbootMybatisApplication;
import com.yiwa.springbootmybatis.dao.UserDao;
import com.yiwa.springbootmybatis.entity.User;
import com.yiwa.springbootmybatis.utils.PageParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JsonbTester;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class UserTest {

    @Autowired
    private UserDao userDao;
    @Test
    public void test(){
        User user=new User();
        user.setUserName("刘备");
        user.setPassWord("21080403");
        user.setUserSex("男");
        user.setNickName("玄德");
        userDao.insertUser(user);
    }
    @Test
    public void test1(){
        User userById = userDao.getUserById(Long.valueOf(1));
        System.out.println(userById);
    }
    @Test
    public void test2(){
        PageParam page=new PageParam();
        page.setCurrentPage(1);
        List<User> all = userDao.getAll(page);
        System.out.println(all);
    }

}
