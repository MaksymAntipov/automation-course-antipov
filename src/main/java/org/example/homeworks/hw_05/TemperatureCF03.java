package org.example.homeworks.hw_05;

public class TemperatureCF03 {

    public static void main(String[] args) {

       double f = myMethod(12);
        {
            System.out.println("Градусов в фаренгейтах: "+ f);
        }
    }
    public static int myMethod(double c) {
        double f = c * 9. / 5 + 32;
        return (int) f;
    }
}
