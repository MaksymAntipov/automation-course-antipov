package org.example.homeworks.hw_05;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CountLetters02 {


    public static void main(String[] args) {

        String s1 = "ttthgyrft";
        char[] s2 = s1.toCharArray();
        char x = 't';
        int y = 0;

        for (int i = 0; i<= s2.length-1; i++)

            if(x == s2[i])
            {
                y+=1;
                System.out.println("Символов "+ y);
            }
            else {
                System.out.println("В тексте нет символа " + x);}
}}
