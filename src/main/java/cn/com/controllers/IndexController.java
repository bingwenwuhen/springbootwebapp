package cn.com.controllers;

import org.mongodb.morphia.Datastore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/4/11.
 */
@Controller
@EnableAutoConfiguration
public class IndexController {

    @Inject
    private Datastore datastore;

    @RequestMapping("/")
    String index() {
        System.out.println(datastore);
        return "index";
    }
}
