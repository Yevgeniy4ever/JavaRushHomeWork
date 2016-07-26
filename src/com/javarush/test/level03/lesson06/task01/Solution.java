package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s1 = "Мама", s2 ="Мыла", s3 = "Раму";
        mama(s1,s2,s3);

    }

    public static void mama (String a1, String a2, String a3)
    {
        System.out.println(a1+a2+a3);
        System.out.println(a1+a3+a2);
        System.out.println(a2+a3+a1);
        System.out.println(a2+a1+a3);
        System.out.println(a3+a1+a2);
        System.out.println(a3+a2+a1);
    }
}