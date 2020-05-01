package org.example.homeworks.hw_05;

public class DistanceKM04 {


    public static void main(String[] args) {
        double m = ConvertorKM(12); //ввести значения в км
        {
            System.out.println("Метров " + m);
        }
    }

        public static double ConvertorKM(double k)
        {
            double m = k * 1000;
            return (double) m;
        }
    }
