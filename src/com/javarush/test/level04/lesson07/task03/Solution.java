package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception    {
        BufferedReader rip = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(rip.readLine());
        int o = Integer.parseInt(rip.readLine());
        int p = Integer.parseInt(rip.readLine());
        int i = 0;
        if (c>0)
            i++;
        if (o>0)
            i++;
        if (p>0)
            i++;
        System.out.println(i);


    }
}
