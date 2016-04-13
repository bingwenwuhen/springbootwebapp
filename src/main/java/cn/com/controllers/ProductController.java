package cn.com.controllers;

import cn.com.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/12.
 */
@Controller
@EnableAutoConfiguration
public class ProductController {

    @RequestMapping("/index")
    String index() {
        return  "hello";
    }

    @RestController
    @RequestMapping(value="/api/users")
    public static class SwaggerController {


        /*
         *  http://localhost:8080/swagger/index.html
         */

        /**
         *
         * @return
         */
        @ApiOperation(value="Get all users",notes="requires noting")
        @RequestMapping(method= RequestMethod.GET)
        public List<User> getUsers(){
            List<User> list=new ArrayList<User>();

            User user=new User();
            user.setName("hello");
            list.add(user);

            User user2=new User();
            user.setName("world");
            list.add(user2);
            return list;
        }

        @ApiOperation(value="Get user with id",notes="requires the id of user")
        @RequestMapping(value="/{name}",method=RequestMethod.GET)
        public User getUserById(@PathVariable String name){
            User user=new User();
            user.setName("hello world");
            return user;
        }
    }
}
