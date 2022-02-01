package com.company;

public class Treugolnik {
    int a;
    int b;
    int c;

    void area(int a, int b, int c){
        int x = (a+b+c) /2;
        System.out.println(Math.sqrt(x-a)*(x-b)*(x-c));
}
}
