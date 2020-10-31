package com.zkw.springbootsxt;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zkw.springbootsxt.domain.User;
import com.zkw.springbootsxt.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootSxtApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testUser(){
        List<User> userList = userService.findAll();
        for(User user : userList){
            System.out.println(user.getUsername());
        }
    }

    @Test
    public void findByPage(){
        //1.执行分页
        PageHelper.startPage(1,1);
        //2.执行查询
        List<User> userList = userService.findAll();
        //3.封装PageInfo对象
        PageInfo<User> pageInfo = new PageInfo<User>(userList);

        for(User user:pageInfo.getList()){
            System.out.println(user);
        }
    }


}
