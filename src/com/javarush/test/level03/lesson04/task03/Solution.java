package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg opuh = new Zerg();
        opuh.name = "Opuh";
        Zerg zhopa = new Zerg();
        zhopa.name = "Zhopa";
        Zerg zaya = new Zerg();
        zaya.name = "Zaya";
        Zerg solnce = new Zerg();
        solnce.name = "Solnce";
        Zerg babuin = new Zerg();
        babuin.name = "Babuin";
        Zerg kovyryak = new Zerg();
        kovyryak.name = "Kovyryak";
        Zerg zhoporuk = new Zerg();
        zhoporuk.name = "Zhoporuk";
        Zerg inozhop = new Zerg();
        inozhop.name = "Inozhop";
        Zerg vanona = new Zerg();
        vanona.name = "Vanona";
        Zerg table = new Zerg();
        table.name = "Table";

        Terran opuh1 = new Terran();
        opuh1.name = "Opuh1";
        Terran zhopa1 = new Terran();
        zhopa1.name = "Zhopa1";
        Terran zaya1 = new Terran();
        zaya1.name = "Zaya1";
        Terran solnce1 = new Terran();
        solnce1.name = "Solnce1";
        Terran babuin1 = new Terran();
        babuin1.name = "Babuin1";
        Terran kovyryak1 = new Terran();
        kovyryak1.name = "Kovyryak1";
        Terran zhoporuk1 = new Terran();
        zhoporuk1.name = "Zhoporuk1";
        Terran inozhop1 = new Terran();
        inozhop1.name = "Inozhop1";
        Terran vanona1 = new Terran();
        vanona1.name = "Vanona1";
        Terran table1 = new Terran();
        table1.name = "Table1";
        Terran chair1 = new Terran();
        chair1.name = "Chair1";
        Terran glass1 = new Terran();
        glass1.name = "glass1";

        Protos opuh2 = new Protos();
        opuh2.name = "Opuh2";
        Protos zhopa2 = new Protos();
        zhopa2.name = "Zhopa2";
        Protos zaya2 = new Protos();
        zaya2.name = "Zaya2";
        Protos solnce2 = new Protos();
        solnce2.name = "Solnce2";
        Protos babuin2 = new Protos();
        babuin2.name = "Babuin2";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}