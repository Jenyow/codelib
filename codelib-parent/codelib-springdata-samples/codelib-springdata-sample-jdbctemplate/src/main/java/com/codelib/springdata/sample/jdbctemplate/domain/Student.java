package com.codelib.springdata.sample.jdbctemplate.domain;

public class Student {

    /**
     * 主键字段
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
