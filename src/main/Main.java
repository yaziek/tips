package main;

import control.Control;

public class Main {

    public static String VERSION = "Tip 0.3";

    public static void main(String[] args) {
        System.out.println("Witaj w programie " + Main.VERSION);

        Control control = new Control();

        control.mainControlPanel();
    }
}
