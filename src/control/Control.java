package control;

import data.DataBase;
import main.Main;

import java.util.Scanner;

public class Control {

    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    Scanner scanner = new Scanner(System.in);
    DataBase dataBase = new DataBase();

    public void showMenu() {
        System.out.println("Wpisz co chcesz zrobić, dostępne opcje:");
        System.out.println(Choices.ADD_TIP.getDescription() + " - dodaj swój napiwek");
        System.out.println(Choices.SHOW_TIPS.getDescription() + " - pokazuje Twoje napiwki");
        System.out.println(Choices.EXIT.getDescription() + " - wyjście z programu");
    }


    public void mainControlPanel() {
        int choice = 0; //help value for Control Loop
        do {
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case ONE:
                    System.out.println("Podaj swój wynik:");
                    int result = scanner.nextInt();
                    dataBase.add(result);
                    break;
                case TWO:
                    dataBase.show();
                    break;
                default:
                    System.out.println("Nierozpoznana komenda!"); // change this one in case of String etc
            }
        } while (choice != 0);
    }

}
