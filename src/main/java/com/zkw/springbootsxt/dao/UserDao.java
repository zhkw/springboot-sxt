package com.zkw.springbootsxt.dao;

import com.zkw.springbootsxt.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<User> findAll();
}
