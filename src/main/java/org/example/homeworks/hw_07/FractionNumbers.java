package org.example.homeworks.hw_07;

public class FractionNumbers {
    double x;
    double y;

    public FractionNumbers(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "FractionNumbers{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    
    public static double plus(double x, double y)
{
    return x+y;
}
    public  static double minus(double x, double y)
{
    return x - y;
}
    public static double multiply(double x, double y)
{
    return x*y;
}
    public static double partition(double x, double y)
{
    return x/y;
}
}




