package cn.com.controllers;

import cn.com.domain.User;
import cn.com.mapper.UserMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/4/12.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getUserInfo",
            method = RequestMethod.GET,
            produces = "application/json;charset=utf-8")
    @ApiOperation(value = "测试user接口")
    public User getUserInfo() {
        User user = userMapper.findUserInfo();
        if(user!=null){
            System.out.println("user.getName():" + user.getName());
        }
        return user;
    }
}
