package cn.com.controllers;

import cn.com.domain.User;
import cn.com.mapper.UserMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by Administrator on 2016/4/12.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MongoTemplate mongoTemplate;

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

    @RequestMapping(value = "/get/mongo", method = RequestMethod.GET)
    @ApiOperation("测试mongo是否整合成功")
    public void testMongo() {
        System.out.println(mongoTemplate);
    }

    @RequestMapping(value = "/hello/{hello}", method = RequestMethod.GET,
    produces = "application/json;charset=utf-8")
    @ApiOperation("测试hello")
    public String sayHello(@PathVariable @PathParam("hello") String hello) {
        return "hello " + hello;
    }
}
