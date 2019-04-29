package main;

import control.Control;
import data.DataBase;

public class Main {

    public static String VERSION = "Tip 0.1";

    public static void main(String[] args) {


        Control control = new Control();
        DataBase dataBase = new DataBase();

        control.showMenu();
        control.mainControlPanel();

    }
}
