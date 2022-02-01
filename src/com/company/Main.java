package com.company;

public class Main {
    public static void main(String[] args) {
        Laptop dellinspiron = new Laptop();
        dellinspiron.name = "Dell Inspiron";
        dellinspiron.color="Steel Black";
        dellinspiron.memory="16GB-Ram";
        dellinspiron.weight="3 kg";
        dellinspiron.processor="AMD radeon Ryzen 3";
        dellinspiron.model();
        dellinspiron.open();
        dellinspiron.close();

        Laptop acer = new Laptop();
        acer.name="Acer";
        acer.memory="2GB-Ram";
        acer.color="Grey";
        acer.weight="1 kg";
        acer.processor="Intel core 3";
        acer.model();
        acer.open();
        acer.close();

        Laptop samsung = new Laptop();
        samsung.name ="Samsung";
        samsung.processor="Intel coleron 1";
        samsung.memory="2 gb Ram";
        samsung.weight="5 kg";
        samsung.color="Standart";
        samsung.model();
        samsung.open();
        samsung.lagaet();

        Laptop gamingAcer = new Laptop();
        gamingAcer.name="gamingAcer";
        gamingAcer.memory="32 GB ram";
        gamingAcer.processor="Intel core 7";
        gamingAcer.weight="4 kg";
        gamingAcer.color="Red";
        gamingAcer.open();
        gamingAcer.close();
    }
}