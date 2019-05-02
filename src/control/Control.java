package control;

import data.DataBase;

import java.util.Scanner;

public class Control {

    public static final int ADD = 1;
    public static final int SHOW = 2;
    public static final int EXIT = 3;

    Scanner scanner = new Scanner(System.in);
    DataBase dataBase = new DataBase();

    private void showMenu() {
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
                case ADD:
                    System.out.println("Podaj swój wynik:");
                    int result = scanner.nextInt();
                    dataBase.add(result);
                    break;
                case SHOW:
                    System.out.println("Twoje napiwki:");
                    dataBase.show();
                    break;
                case EXIT:
                    System.out.println("Do zobaczenia!");
                    choice = 0;
                    break;
                default:
                    System.err.println("Nierozpoznana komenda!"); // change this one in case of String etc
            }
        } while (choice != 0);
    }

}
