package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Treugolnik uch = new Treugolnik();
        System.out.println("Введите размеры треугольника: ");
        uch.a = sc.nextInt();
        uch.b = sc.nextInt();
        uch.c = sc.nextInt();
        System.out.print("Аянты: ");
        uch.area(uch.a,uch.b,uch.c);

    }
}
