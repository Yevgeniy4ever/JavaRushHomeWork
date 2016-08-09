package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = listInitialize();
        list.remove(2);
        arOut(list);
    }

    public static ArrayList<String> listInitialize() throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        int x = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (x < 5) {
            list.add(reader.readLine());
            x++;
        }
        return list;
    }

    public static void arOut(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
