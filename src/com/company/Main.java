package com.company;
public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.setName("Dell Inspiron 3310");
        laptop1.setProcessor("Amd Ryzen 3");
        laptop1.setColor("Classic Black");
        laptop1.setVes("3 kg");
        laptop1.setOzu(36);

        laptop1.fullmodel();
        Ryba losos = new Ryba();
        losos.setName("Лосось");
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