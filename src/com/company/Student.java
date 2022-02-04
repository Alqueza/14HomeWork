package com.company;
public class Student {
    private String birthday;
    private String name;
    private String lastname;
    private int age;

    public Student(String birthday, String name, String lastname, int age) {
        this.birthday = birthday;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Student() {
    }

    public void info() {
        System.out.println("Аты:" + name + " Фамилия:" + lastname + " Жашы:" + age + " Туулган куну:" + birthday);
    }
}