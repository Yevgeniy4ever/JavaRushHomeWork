package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        Human graPaLera = new Human("Инна", false, 22);
        Human graMoKatya = new Human("Инна", false, 23);
        Human graPaPetr = new Human("Петр", true, 15);
        Human graMoLena = new Human("Лена", false, 25);
        Human paIgor = new Human("Игорь", false, 77, graPaPetr, graMoLena);
        Human moAnna = new Human("Инна", false, 32, graPaLera, graMoKatya);
        Human soSasha = new Human("Инна", false, 33, paIgor, moAnna);
        Human soVasya = new Human("Инна", false, 12, paIgor, moAnna);
        Human doSveta = new Human("Инна", false, 9, paIgor, moAnna);

        System.out.println(graPaLera.toString());
        System.out.println(graMoKatya.toString());
        System.out.println(graPaPetr.toString());
        System.out.println(graMoLena.toString());
        System.out.println(paIgor.toString());
        System.out.println(moAnna.toString());
        System.out.println(soSasha.toString());
        System.out.println(soVasya.toString());
        System.out.println(doSveta.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String myname, boolean sex, int age, Human father, Human mother) throws IOException {
            // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            this.name = myname; //reader.readLine();
            this.sex = sex; //Boolean.parseBoolean(reader.readLine());
            this.age = age; //Integer.parseInt(reader.readLine());
            this.father = father;
            this.mother = mother;

        }

        Human(String name, boolean sex, int age) throws IOException {
            //          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            this.name = name; //reader.readLine();
            this.sex = sex; //Boolean.parseBoolean(reader.readLine());
            this.age = age;//Integer.parseInt(reader.readLine());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
