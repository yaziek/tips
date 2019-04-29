package main;

import data.DataBase;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        DataBase dataBase = new DataBase();

        dataBase.add(120);
        dataBase.add(80);
        dataBase.add(180);

        dataBase.show();

    }
}
