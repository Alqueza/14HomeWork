package com.company;
public class Main {
    public static void main(String[] args) {
        Curs bir = new Curs("Adilet","0706157252","Zamir","Yanvar");
        Student student = new Student("11.11.2003","Adilet","Otorbaev",18);
        bir.info();
        student.info();
    }
}