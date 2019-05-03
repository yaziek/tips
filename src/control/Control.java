package control;

import data.DataBase;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Control {

    Scanner scanner = new Scanner(System.in);

    public static int OPTION = 0;
    public static final int ADD = 1;
    public static final int SHOW = 2;
    public static final int SUM = 3;
    public static final int AVG = 4;
    public static final int EXIT = 5;

    DataBase dataBase = new DataBase();
    DataReader dataReader = new DataReader();

    public void mainControlPanel() {
        int option; //help value for Control Loop
        do {
            showMenu();
            option = dataReader.getInt();
            switch (option) {
                case ADD:
                    addTip();
                    break;
                case SHOW:
                    showTips();
                    break;
                case SUM:
                    sumTips();
                    break;
                case AVG:
                    average();
                    break;
                case EXIT:
//                    option = 0;
                    exit();
                    break;
                default:
                    System.err.println("Nie ma takiej opcji, wprowadź ponownie:");
            }
        } while (option != EXIT);
    }

        private void showMenu () {
            System.out.println("Wpisz co chcesz zrobić, dostępne opcje:");
            System.out.println(ADD + " - dodaj swój napiwek");
            System.out.println(SHOW + " - pokazuje Twoje napiwki");
            System.out.println(SUM + " - wyświetla sumę napiwków");
            System.out.println(AVG + " - wyświetla średnią z napiwków");
            System.out.println(EXIT + " - wyjście z programu");
        }

        public void addTip () {
            System.out.println("Podaj swój wynik:");
            int result = dataReader.getInt();
            dataBase.add(result);
            System.out.println("Dodano " + result);
        }

        public void showTips () {
            //using Iterator class (fast iterating) - later change it for lambda
            System.out.println("Twoje napiwki:");
            Iterator<Integer> numIterator = dataBase.getTips().iterator();
            while (numIterator.hasNext()) {
                int tip = numIterator.next();
                System.out.print(tip + "; ");
            }
            System.out.println(); //added in terms of blank line after showing all results
        }

        public void sumTips () {
            int sum = 0;
            for (Integer integer : dataBase.getTips()) {
                sum += integer;
            }
            System.out.println("Suma wszystkich Twoich napiwków to: " + sum);
        }

        public void average () {
            int sum = 0;
            for (Integer integer : dataBase.getTips()) {
                sum += integer;
            }
            int avr = sum / dataBase.getTips().size();
            System.out.println("Zarobiłeś średnio: " + avr);
        }

        private void exit () {
            System.out.println("Do zobaczenia!");
            dataReader.close();
        }


    }
