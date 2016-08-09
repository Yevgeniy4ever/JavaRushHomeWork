package com.javarush.test.level07.lesson04.task05;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = bidArrayInitialize();
        out(array);

    }

    public static int[] bidArrayInitialize() throws IOException {
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void out(int[] array) {
        int[] smp1 = new int[10];
        int[] smp2 = new int[10];

        for (int i = 0; i < 10; i++) {
            smp1[i] = array[i];
            smp2[i] = array[array.length / 2 + i];
            System.out.println(smp2[i]);
        }
    }
}
