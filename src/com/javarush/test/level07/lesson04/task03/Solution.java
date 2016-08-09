package com.javarush.test.level07.lesson04.task03;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой
совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение
выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] str = initializeStrArray();
        //       int[] num = initializeIntArray();

        href(str);
    }

    public static String[] initializeStrArray() throws IOException {
        String[] strOut = new String[10];
        BufferedReader RT = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            strOut[i] = RT.readLine();
        return strOut;
    }
 /*   public static int[] initializeIntArray() throws IOException {
        int[] intOut = new int[10];
        BufferedReader RT = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите цифры");

        for (int i = 0; i<10; i++)
            intOut[i] = Integer.parseInt(RT.readLine());
            return intOut;
    } */

    public static void href(String[] ar1 /*int[] ar2*/) {
        for (int i = 0; i < 10; i++) {
            int[] ar2 = new int[10];
            String s = ar1[i];
            ar2[i] = s.length();
            System.out.println(ar2[i]);
        }

    }
}
