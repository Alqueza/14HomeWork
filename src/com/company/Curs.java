package com.company;

public class Curs {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getNachalocurs() {
        return nachalocurs;
    }

    public void setNachalocurs(String nachalocurs) {
        this.nachalocurs = nachalocurs;
    }

    private String name;
    private String lastname;
    private int age;
    private String birthday;
    private int phonenumber;
    private String nachalocurs;

    public void person() {
        System.out.println("Аты жону :"+name+" "+lastname+" Жашы :"
                +age+" Туулган куну: "+birthday+" Номер телефона: "+phonenumber+
                " Курстун башташы:"+nachalocurs);
    }
}
