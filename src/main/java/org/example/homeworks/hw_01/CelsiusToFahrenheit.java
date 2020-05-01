package org.example.homeworks.hw_01;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        System.out.println("Введите значение в цельсиях:");
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();

        double f = c * 9. / 5 + 32;
        System.out.print("Градусов в фаренгейтах: ");
        System.out.println(f);
    }
}
