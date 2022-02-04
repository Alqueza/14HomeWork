package com.company;

public class Curs {
    private String name;
    private String number;
    private String teachername;
    private String nachalocurs;

    public Curs(String name,String number,String teachername,String nachalocurs){
        this.name = name;
        this.number = number;
        this.teachername = teachername;
        this.nachalocurs = nachalocurs;
    }
    public Curs(){}
    public void info(){
        System.out.println("Аты:"+name+" Номер:"+number+" Мугалими:"+teachername+" Курс башталганы:"+nachalocurs);
    }
}
