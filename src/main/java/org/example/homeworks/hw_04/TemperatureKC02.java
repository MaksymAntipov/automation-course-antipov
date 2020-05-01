package org.example.homeworks.hw_04;

public class TemperatureKC02 {
    public static void main(String[] args) {

        double с = ConvertorKC(144);// ввести градусов в кельвинах
        {
            System.out.println("Градусов в цельсиях " + с);
        }
    }
    public static double ConvertorKC(double k)
    {
        double c = k - 273.15;
        return (double) c;
    }
}


