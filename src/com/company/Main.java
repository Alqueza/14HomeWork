package com.company;
public class Main {
    public static void main(String[] args) {
        Ryba losos = new Ryba();
        losos.setName("Лосось");
        System.out.println(losos.getName());
        losos.ryby();

        Popug kesha = new Popug();
        kesha.setName("Kesha");
        System.out.println(kesha.getName());
        kesha.popuga();

        Cat murka = new Cat();
        murka.setName("Murka");
        murka.setPol("M");
        System.out.println("Имя: "+murka.getName());
        System.out.println("Пол: "+murka.getPol());
        murka.cats();

        Dog ackjol = new Dog();
        ackjol.setName("Акжол");
        ackjol.setColor("Ак тустуу");
        ackjol.setPol("M");
        System.out.println("Аты: "+ackjol.getName());
        System.out.println("Тусу: "+ackjol.getColor());
        System.out.println("Пол: "+ackjol.getPol());
        ackjol.dogs();
    }
    }