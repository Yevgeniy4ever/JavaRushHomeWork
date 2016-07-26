package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader like = new BufferedReader(new InputStreamReader(System.in));
        Person person = new Person();
        person.name = like.readLine();
        person.age = Integer.parseInt(like.readLine());
        if (person.age < 18)
            System.out.println("Подрасти еще");
    }

    public static class Person{
        String name;
        int age;
    }
}
