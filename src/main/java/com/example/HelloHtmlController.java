package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Gensis on 2016/9/9.
 */
@RestController
public class HelloHtmlController {

    // 从 application.yml 中读取配置，如取不到默认值为Hello
    @Value("${hello:Hello}")
    private String hello;

    @RequestMapping("/hellohtml")
    public List helloHtml(Map<String, Object> map) {
        System.out.println("HelloController.helloJsp().hello=" + hello);
        map.put("hello", hello);
        List result = new ArrayList();
        User user = new User();
        user.setName("hello");
        user.setAge(hello);
        result.add(user);
        return result;
    }

}