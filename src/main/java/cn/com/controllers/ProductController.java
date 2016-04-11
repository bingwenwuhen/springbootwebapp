package cn.com.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
