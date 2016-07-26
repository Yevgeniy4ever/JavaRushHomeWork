package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(stream.readLine());
        boolean s = a%2==0;
        if(a>0)
            System.out.print("положительное ");
        else if(a<0) System.out.print("отрицательное ");
        if(!s) System.out.print("нечетное ");
        else if(a == 0) System.out.print("нулевое ");
        else if(s) System.out.print("четное ");
        System.out.println("число");
    }
    }


