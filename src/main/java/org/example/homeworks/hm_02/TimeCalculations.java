package org.example.homeworks.hm_02;

import java.util.Scanner;

public class TimeCalculations {

    public static void main(String[] args) {
        char m = 60; //в минуте секунд
        char h = 60; //в 1м часе минут
        char d = 24; //в 1м дне часов
        char w = 7; //в 1й неделе дней
        double y = 52.1429; // в 1м году недель

        double l = h*m; // секунд в 1м часе
        System.out.print("Секунд в одном часе: ");
        System.out.println(l);

        double b = l*d; // секунд в 1м дне
        System.out.print("Секунд в одном дне: ");
        System.out.println(b);

        double a = b*w; // секунд в 1й неделе
        System.out.print("Секунд в одной неделе: ");
        System.out.println(a);

        double p = a*y; // секунд в 1м году
        System.out.print("Секунд в одном году: ");
        System.out.println(p);



        System.out.println("Введите значение в секундах:");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();


        double v = k/m; //minute
        double j = k/b; //day
        double n = k/a; //weeks
        double x = k/p; //year


        System.out.print("Секунд в минутах: ");
        System.out.println(v);
        System.out.print("Секунд в днях: ");
        System.out.println(j);
        System.out.print("Секунд в неделях: ");
        System.out.println(n);
        System.out.print("Секунд в годах: ");
        System.out.println(x);




    }
}