package org.example.homeworks.hw_04;

public class TemperatureFC04 {


    public static void main(String[] args) {

        double c = ConvertorFC(12); //ввести значение в фарентгейтах
        {
            System.out.println("Градусов в цельсиях " + c);
        }
    }
        public static double ConvertorFC ( double f)
        {
            double c = (f - 32) * 5 / 9;
            return (double) c;
        }

    }





