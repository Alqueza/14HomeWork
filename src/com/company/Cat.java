package com.company;

public class Cat {
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

    private String pol;

    public void cats(){
        System.out.println(name+" чычканды кубалай баштады!");
    }
}
