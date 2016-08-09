package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = listInitialalize();
        sOut(list);
    }

    private static ArrayList<String> listInitialalize() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        return list;
    }

    public static void sOut(ArrayList<String> list) {
        String s = list.get(0);
        int max = s.length();
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            if (s.length() > max)
                max = s.length();
        }


        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            if (s.length() == max)
                System.out.println(list.get(i));
        }
    }
}


