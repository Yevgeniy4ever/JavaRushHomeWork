package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int k = 0; k != -1; ) {
            k = Integer.parseInt(reader.readLine());
            sum = sum + k;
        }
        System.out.println(sum);
    }
}
