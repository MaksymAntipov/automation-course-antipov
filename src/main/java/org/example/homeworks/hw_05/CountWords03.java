package org.example.homeworks.hw_05;

import java.util.StringTokenizer;

public class CountWords03 {
    public static void main(String[] args) {

        String s1 = "Text TEXT texT";
        char[] s2 = s1.toCharArray();
        char x = ' ';
        int y = 1; // это наверное как костыль какой-то? или и такой подход норм?

        for (int i = 0; i<= s2.length-1; i++)


            if(x == s2[i])
            {
                y+=1;
            }
        {
            System.out.println("Слов в тексте "+ y);
        }
    }}

