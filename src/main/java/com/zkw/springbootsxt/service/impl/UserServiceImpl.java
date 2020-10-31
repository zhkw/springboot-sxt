package com.zkw.springbootsxt.service.impl;

import com.zkw.springbootsxt.dao.UserDao;
import com.zkw.springbootsxt.domain.User;
import com.zkw.springbootsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
