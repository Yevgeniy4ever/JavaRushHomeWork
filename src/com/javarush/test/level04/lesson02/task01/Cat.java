package com.javarush.test.level04.lesson02.task01;

/* Реализовать метод setName
Реализовать метод setName, чтобы с его помощью можно было устанавливать
 значение переменной private String name равное переданному параметру String name.
*/

import java.io.*;

public class Cat {
    private static String name;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Cat cat = new Cat();
        cat.setName(reader.readLine());
    }

    public void setName(String name) {
        Cat.name = name;
        System.out.println(Cat.name);
    }
}
