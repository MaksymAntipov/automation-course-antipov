package org.example.homeworks.hm_02;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Example_24 {


    public static void main(String[] args) {

        double x = 1.;
        double y = atan(abs(8.3 - 21 * pow(x, 2) - 0.8 * x) / pow((2.5 + (1. / pow(x, 2))), 1. / 3));
        out.println(y);
    }

}
