package cn.com.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/4/11.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
