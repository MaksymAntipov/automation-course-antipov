package org.example.homeworks.hw_05;

public class TemperatureCK01 {
    public static void main(String[] args) {

    double k = ConvertorKC(123); //ввести значение в цельсиях
    {
        System.out.println("Градусов в кельвинах: " + k);
    }
}
    public static double ConvertorKC(double c) {
        double k = c + 273.16;
        return (double) k;

    }
}
