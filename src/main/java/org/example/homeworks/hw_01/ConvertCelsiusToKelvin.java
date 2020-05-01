package org.example.homeworks.hw_01;

import java.util.Scanner;

public class ConvertCelsiusToKelvin {

    public static void main(String[] args) {


        System.out.println("Введите значение в цельсиях:");
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();

        double k = c + 273.16;
        System.out.print("Градусов в Кельфинах: ");
        System.out.println(k);
    }
}
