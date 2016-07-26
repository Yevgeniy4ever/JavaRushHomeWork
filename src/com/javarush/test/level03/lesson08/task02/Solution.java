package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader letter =  new BufferedReader(new InputStreamReader(System.in));
        String s1 = letter.readLine();
        String s2 = letter.readLine();
        String s3 = letter.readLine();
        Integer i2 = Integer.parseInt(s2);
        Integer i3 = Integer.parseInt(s3);
        System.out.println(s1 + " получает " + s2 + " через " + s3 + " лет.");//напишите тут ваш код
    }
}