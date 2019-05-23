package com.jk.model;

import java.io.Serializable;

public class PoitestBean implements Serializable {

    private Integer id ;

    private String name ;

    private String password ;

    private String sex ;

    private Integer age ;

    private String wannengname;


    @Override
    public String toString() {
        return "PoitestBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", wannengname='" + wannengname + '\'' +
                '}';
    }

    public String getWannengname() {
        return wannengname;
    }

    public void setWannengname(String wannengname) {
        this.wannengname = wannengname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
