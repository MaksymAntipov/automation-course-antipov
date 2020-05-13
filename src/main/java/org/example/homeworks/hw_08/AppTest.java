package org.example.homeworks.hw_08;

import static org.example.homeworks.hw_08.FractionNumbers.*;

public class AppTest {
    public static void main(String[] args) {
       FractionNumbers fr1 = new FractionNumbers(1,2);
       FractionNumbers fr2 = new FractionNumbers(17,59);


        {
            System.out.println(fr1);
        }

        fr1.plus(fr2);
    }
}

