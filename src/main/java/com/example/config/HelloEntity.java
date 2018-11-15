package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author:wangyankai
 * @Description: Date:Created in 15:10 2018/5/17
 */
@Component
@ConfigurationProperties(prefix="myProps") //接收application.yml中的myProps下面的属性
public class HelloEntity {
    public static String name;
    public static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
