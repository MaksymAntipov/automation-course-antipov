package org.example.homeworks.hw_04;

public class DistanceMK03 {


    public static void main(String[] args) {
        double k = ConvertorMK(12);
        {
            System.out.println("Километров " + k);
        }
    }
       public static double ConvertorMK(double m)
        {
            double k = m/0.621371;
            return (double) k;
        }}
