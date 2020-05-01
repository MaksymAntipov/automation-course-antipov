package org.example.homeworks.hw_05;

public class DistanceMI01 {


    public static void main(String[] args) {
        double i = ConvertorMI(12);// ввести значение в метрах
        {
            System.out.println("Дюймов " + i);
        }
    }
            public static double ConvertorMI(double m) {
                double i = m * 39.37;
                return (double) i;
            }}

