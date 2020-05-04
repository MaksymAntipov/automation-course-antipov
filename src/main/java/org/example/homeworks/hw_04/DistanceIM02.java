package org.example.homeworks.hw_04;

public class DistanceIM02 {


    public static void main(String[] args) {
        double m = ConvertorIM(12); //ввести значение в дюймах
        {
            System.out.println("Метров " + m);
        }
    }

        public static double ConvertorIM(double i)
        {
            double m = i / 39.37;
            return (double) m;
        }


    }
