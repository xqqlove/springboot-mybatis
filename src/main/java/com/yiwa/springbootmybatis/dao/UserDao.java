package com.yiwa.springbootmybatis.dao;

import com.yiwa.springbootmybatis.entity.User;
import com.yiwa.springbootmybatis.utils.PageParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<User> getAll(PageParam page);
    public User getUserById(Long id);
    public void insertUser(User user);
    public void update(User user);
}
