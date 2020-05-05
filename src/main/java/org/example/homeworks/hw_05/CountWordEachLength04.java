package org.example.homeworks.hw_05;

public class CountWordEachLength04 {

    public static void main(String[] args) {


    String s1 = "eqwe qweqwe wqeq wq weqweqwe sdsd";{
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
}}}






