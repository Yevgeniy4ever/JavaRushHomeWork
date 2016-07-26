package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if ((a>b) && (a>c)) {
            System.out.println(a);
            if (b > c) {
                System.out.println(b);
                System.out.println(c);
            }
            if (c > b) {
                System.out.println(c);
                System.out.println(b);
            }
        }
        if ((b>a) && (b>c)){
            System.out.println(b);
            if (a > c){
                System.out.println(a);
                System.out.println(c);
            }
            if (c > a){
                System.out.println(c);
                System.out.println(a);
            }
        }

        if ((c>a) && (c>b)){
            System.out.println(c);
            if (a > b){
                System.out.println(a);
                System.out.println(b);
            }
            if (b > a){
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
