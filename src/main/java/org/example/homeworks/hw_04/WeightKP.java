package org.example.homeworks.hw_04;

public class WeightKP {

    public static void main(String[] args) {
        double p = ConvertorKP(12);
        {
            System.out.println("Фунтов " + p);
        }
    }
        public static double ConvertorKP(double k)
        {
            double p = k* 2.205;
            return (double) p;

        }
    }




