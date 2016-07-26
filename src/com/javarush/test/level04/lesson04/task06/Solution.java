package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        if (k==1) System.out.println("понедельник");
        if (k==2) System.out.println("вторник");
        if (k==3) System.out.println("среда");
        if (k==4) System.out.println("четверг");
        if (k==5) System.out.println("пятница");
        if (k==6) System.out.println("суббота");
        if (k==7) System.out.println("воскресенье");
        if ((k<1) || (k>7)) System.out.println("такого дня недели не существует");
    }
}