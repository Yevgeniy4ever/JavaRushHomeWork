package com.javarush.test.level04.lesson16.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        person vasya = new person();
        vasya.name = reader.readLine();
        for (int i = 0; i < 3; i++) {
            vasya.db[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Меня зовут " + vasya.name);
        System.out.println("Я родился " + vasya.db[2] + "." + vasya.db[1] + "." + vasya.db[0]);

    }

    static class person {
        String name;
        int[] db = new int[3];
    }
}




  /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int d = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);*/