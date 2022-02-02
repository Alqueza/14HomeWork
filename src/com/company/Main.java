package com.company;
public class Main {
    public static void main(String[] args) {
        Curs birinchi = new Curs();
        birinchi.setName("Adilet");
        birinchi.setLastname("Otorbaev");
        birinchi.setBirthday("11.11.03");
        birinchi.setAge(18);
        birinchi.setPhonenumber(070617252);
        birinchi.setNachalocurs("Начало января");


        System.out.println(birinchi.getAge());
        if (birinchi.getAge() >= 0) {
            System.out.println("Жашы он "+birinchi.getAge());
        }
        birinchi.person();

//        Laptop dellinspiron = new Laptop();
//        //set. добавить значения
//        dellinspiron.setName("Dell Inspiron 3310");
//        dellinspiron.setColor("Steel Black");
//        dellinspiron.setMemory("16GB-Ram");
//        dellinspiron.setWeight("3kg");
//        dellinspiron.setProcessor("AMD Ryzen 3");
//        //get. дать доступ
//        dellinspiron.getName();
//        dellinspiron.getColor();
//        dellinspiron.getMemory();
//        dellinspiron.getProcessor();
//        dellinspiron.getWeight();
//
//        System.out.println(dellinspiron.getName());
//        System.out.println(dellinspiron.getColor());
//        System.out.println(dellinspiron.getMemory());
//        System.out.println(dellinspiron.getProcessor());
//        System.out.println(dellinspiron.getWeight());
    }
}