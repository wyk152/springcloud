package com.example;

import java.io.Serializable;

/**
 * @Author:wangyankai
 * @Description: Date:Created in 11:38 2018/5/11
 */
public class User implements Serializable {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
