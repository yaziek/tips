package control;

import data.DataBase;
import main.Main;

import java.util.Scanner;

public class Control {

    Scanner scanner = new Scanner(System.in);
    DataBase dataBase = new DataBase();

    public void showMenu(){
        System.out.println("Witaj w programie " + Main.VERSION);
        System.out.println("Wpisz co chcesz zrobić, dostępne opcje:");
        System.out.println(Choices.ONE.getDescription() + " - dodaj swój napiwek");
        System.out.println(Choices.TWO.getDescription() + " - pokazuje Twoje napiwki");
        System.out.println(Choices.THREE.getDescription() + " - wyjście z programu");
    }

    public void mainControlPanel(){
        Choices choice;
        do {
            String input = scanner.next();
            choice = Choices.fromDescription(input);
            switch (choice) {
                case ONE:
                    System.out.println("Podaj swój wynik:");
                    int result = scanner.nextInt();
                    dataBase.add(result);
                    break;
                case TWO:
                    dataBase.show();
                    break;
            }
        }while (!choice.equals(Choices.THREE));

        scanner.close();
    }

}
