package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution {
    public static HashSet<String> createSet()    //Метод заполняющий List интерфей HashSet (куча) рандомными значениями начинающимися на букву "Л"
    {
        HashSet<String> lSet = new HashSet<String>(); //Обьявляем множество lDet типа "Строка"
        for (int i = 0; i < 20; i++) {            //Запускаем массив на от 0 до 20 с шагом 1
            lSet.add("Л" + i + "точно");         //Код "генерирующий" и добавляющий значения в множество lSet
        }

        return lSet;                             //Возвращаем значение


    }


}
