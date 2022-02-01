package com.company;

public class Person {
    String name;//имя
    String lastName;//фамилия
    byte age;//возраст
    double height;//рост
    double weight;//вес
    char gender; //мужчина или женщина
    String color;//цвет
    String nationallity;//нация
    String status; //Женат не женат
    Boolean education; //образование

    public void informationPerson(){
        System.out.println("Имя:"+name+" Фамилия:"+lastName+" Возраст:"+age+" Национальность:"+nationallity+" Статус:"+status+" Рост:"+height+" Вес:"+weight+" Цвет:"+color+" Гендер:"+gender+" Образование:"+education);
    }
}