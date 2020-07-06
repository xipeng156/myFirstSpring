package com.qst.maven.entity;

public class User {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String username;
    private String ardress;
    private String classid;

    public User() {
    }

    public User(int id, String name, int age, String sex, String username, String ardress, String classid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.username = username;
        this.ardress = ardress;
        this.classid = classid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", username='" + username + '\'' +
                ", ardress='" + ardress + '\'' +
                ", classid='" + classid + '\'' +
                '}';
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getArdress() {
        return ardress;
    }

    public void setArdress(String ardress) {
        this.ardress = ardress;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }
}
