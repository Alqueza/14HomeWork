package com.company;

public class Laptop {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVes() {
        return ves;
    }

    public void setVes(String ves) {
        this.ves = ves;
    }

    private String name;

    public int getOzu() {
        return ozu;
    }

    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

    private int ozu;
    private String color;
    private String processor;
    private String ves;

    public void fullmodel(){
        System.out.println("Название:"+name+". Память:"+ozu+" GB Ram. Цвет:"+color+". Вес:"+ves);

        if(ozu<36){
            System.out.println("Слабая память для современных игр");
        }else {
            System.out.println("Хорошая память! так держать!");
        }
    }
}
