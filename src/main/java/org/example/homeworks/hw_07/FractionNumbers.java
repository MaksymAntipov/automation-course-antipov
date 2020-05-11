package org.example.homeworks.hw_07;

public class FractionNumbers {
    double x;
    double y;
    char z;

    public FractionNumbers(double x, double y, char z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return "FractionNumbers{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static double Calc(double x, double y, char z)
    {
        if (z == '-') {
            double res = x - y;
            return (double) res;
        }
        else if (z=='+')
        {
            double res = x+y;
            return (double) res;
        }
        else if(z =='*') {
            double res = x * y;
            return (double) res;
        }
        else if (z == '/')
        {
            double res = x/y;
            return (double) res;
        }
        else {
            System.out.println("Такая операция не поддерживаетя");
        }
        return x; // эту строку рекомендовала внедрить java, только не могу понять, что я не так делал, зачем постоянно возвращать переменную x?

    }}