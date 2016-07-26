package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution{
    public static void main(String[] args) throws Exception    {
        BufferedReader heap = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(heap.readLine());
        boolean a = g%2==0 && g!=0;
        boolean b = g>=1 && g<=9;
        boolean c = g>=10 && g<=99;
        boolean d = g>=100 && g<=999;
        String k ="";

        if (a)
            k = "четное ";
        else if (!a)
            k = "нечетное ";

        if (b)
            System.out.print(k+"однозначное число");
        if (c)
            System.out.print(k+"двузначное число");
        if (d)
            System.out.print(k+"трехзначное число");
        }
}