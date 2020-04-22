package org.example.homeworks.hw_02;

import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {
// Деление первого числа на второе/получение результата + процент второго числа от первого
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int k = in.nextInt();

        in = new Scanner(System.in);
        System.out.print("Введите второе значение: ");
        int num_01 = in.nextInt();
        double m = num_01;

        double b = k/m;
        double v = (m/k)*100;

        System.out.print("Результат: ");
        System.out.println(b);
        System.out.print("Процент от числа: ");
        System.out.printf(String.valueOf(v));



        in.close();




    }
}