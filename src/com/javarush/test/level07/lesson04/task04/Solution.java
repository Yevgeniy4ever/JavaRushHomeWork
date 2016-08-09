package com.javarush.test.level07.lesson04.task04;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        int[] array = arrayInitialize();
        output(array);


    }

    public static int[] arrayInitialize() throws IOException {
        int[] array = new int[10];
        int i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (i < 10) {
            array[i] = Integer.parseInt(reader.readLine());
            i++;
        }
        return array;
    }

    public static void output(int[] array) {
        //int k = 0;
        //int prom;
        for (int i = array.length - 1; i >= 0; i--) {  //i = 9, i больше или равно 5 . 9, 8, 7, 6, 5
            System.out.println(array[i]);
            // System.out.println("Длина - 1 равняется: " + (array.length-1));
            //System.out.println("i = " + i + " меньше или равно " + (array.length/2));
            //prom = array[i];
            //System.out.println("В переменной prom хранится " + prom);
            //array[i] = array[k];
            //System.out.println("В переменной array[" + i + "] хранится: " + array[i]);
            //array[k] = prom;
            //System.out.println("В переменной array[" + k + "] хранится: " + array[k]);
            //k++;
        }

        // for (int i = 0; i < 10; i ++ ){
        //   System.out.println(array[i]);
        // }
    }
}
