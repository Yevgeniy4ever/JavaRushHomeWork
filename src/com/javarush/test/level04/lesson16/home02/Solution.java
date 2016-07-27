package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ar[] = new int[3];
        int sred = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < 3; i++) {
            ar[i] = Integer.parseInt(reader.readLine());
            if (ar[i] < min)
                min = ar[i];
            if (ar[i] > max)
                max = ar[i];
        }
        for (int i = 0; i < 3; i++) {
            if ((ar[i] < max) && (ar[i] > min))
                sred = ar[i];
        }
        System.out.println(sred);
    }
}
