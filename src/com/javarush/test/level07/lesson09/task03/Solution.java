package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;
import java.util.List;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < 3; i++) {
            list.add(i * 2 + 1, "именно");
        }
        int i = 0;
        for (String x : list) {
            System.out.println(list.get(i++));
        }
    }
}
