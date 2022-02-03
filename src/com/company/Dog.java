package com.company;

public class Dog {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String pol;
    private String color;

    public void dogs(){
        System.out.println(name+" Мышык чычканды кубалап жатканын коруп отурду.");
    }
}
