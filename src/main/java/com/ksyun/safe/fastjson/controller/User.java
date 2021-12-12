package com.ksyun.safe.fastjson.controller;

import javax.annotation.sql.DataSourceDefinition;


public class User {
    String name;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
