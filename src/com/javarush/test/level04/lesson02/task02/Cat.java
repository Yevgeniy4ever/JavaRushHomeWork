package com.javarush.test.level04.lesson02.task02;

/* Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
 количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/

public class Cat {

    public static void main(String[] args) {
        Cat vasya = new Cat();
        Cat.addNewCat();
        System.out.println(vasya.catsCount);
        Cat.addNewCat();
        System.out.println(vasya.catsCount);


    }
    private static int catsCount = 0;

    public static void addNewCat() {
        Cat.catsCount++;
        System.out.println(Cat.catsCount);
        //напишите тут ваш код
    }
}
