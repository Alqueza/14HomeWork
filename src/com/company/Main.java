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
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите цифру: ");
//        String str = scanner.next();
//        int chet = 0;
//        int sum = 0;
//        for (int i = 0; i < str.length(); i++) {
//                chet++;
//        }
//        if (chet >= 1) {
//            System.out.println("Строка содержит " +chet+" строк.");
//        }