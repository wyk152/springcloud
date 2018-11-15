package com.example;

import com.example.config.HelloEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Gensis on 2016/9/9.
 */
@Controller
public class HelloController {

    // 从 application.properties 中读取配置，如取不到默认值为Hello
/*    @Value("${hello:Hello}")
    private String hello;*/


    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String, Object> map) {
        System.out.println("HelloController.helloJsp().hello=" + HelloEntity.name);
        map.put("hello", HelloEntity.name);
        return "helloJsp";
    }


}