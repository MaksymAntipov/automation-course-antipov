package org.example.homeworks.hw_04;

public class WeightPK01 {
    public static void main(String[] args) {
        double k = ConertorPK(12);// ввести значения в фунтах
        {
            System.out.println("Киллограм " + k);
        }
    }

        public static double ConertorPK(double p)
        {
            double k = p/2.205;
            return (double) k;
        }
    }



