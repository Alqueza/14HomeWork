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
        System.out.println(murka.getName());
        murka.cats();

        Dog ackjol = new Dog();
        ackjol.setName("ackjol");
        System.out.println(ackjol.getName());
        ackjol.dogs();
    }
    }