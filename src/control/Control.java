package control;

import data.DataBase;
import exception.NoSuchOptionException;
import files.CreateFileDataBase;
import user.Person;
import user.PersonMenu;

import java.util.InputMismatchException;
import java.util.Iterator;

public class Control {
    DataBase dataBase = new DataBase();
    DataReader dataReader = new DataReader();
    PersonMenu personMenu = new PersonMenu();
    CreateFileDataBase create = new CreateFileDataBase();

    Person dataBaseOwner = personMenu.personCreatorLoop();

    public void mainControlPanel() {

//        create.createFile(dataBaseOwner); //<<<creating file to storage tips

        Menu option; //help value for Control Loop
        if (PersonMenu.OPTION == 0) {
            do {
                showMenu();
                option = getOption();
                switch (option) {
                    case ADD_TIP:
                        addTip();
                        break;
                    case SHOW_TIPS:
                        showTips();
                        break;
                    case SUM_TIPS:
                        sumTips();
                        break;
                    case AVG_TIPS:
                        average();
                        break;
                    case COSTS:
                        showCosts();
                        break;
                    case EXIT:
                        exit();
                        break;
                    default:
                        System.err.println("Nie ma takiej opcji, wprowadź ponownie:");
                }
            } while (!option.equals(Menu.EXIT));
        }
    }

    private void showCosts() {
        System.out.println("Twoje dzienne koszty to:");
        System.out.println("Dla barmana: " + dataBaseOwner.getBartender());
        System.out.println("Za obiad: " + dataBaseOwner.getDinner());
        System.out.println("Na zmywak: " + dataBaseOwner.getSink());
        System.out.println("Inne koszty: " + dataBaseOwner.getOther());
    }

    private Menu getOption() { //loop for getting proper value, exceptions handled
        boolean optionOk = false;
        Menu option = null;
        while (!optionOk) {
            try {
                option = Menu.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException ex) {
                System.err.println(ex.getMessage() + ", podaj ponownie");
            } catch (InputMismatchException ingored) {
                System.err.println("Wprowadzono wartość, która nie jest liczbą, podaj ponownie");
            }
        }
        return option;
    }

    private void showMenu() {
        System.out.println("Wpisz co chcesz zrobić, dostępne opcje:");
        for (Menu menu : Menu.values()) {
            System.out.println(menu.toString());
        }
    }

    private void addTip() {
        System.out.println("Podaj swój wynik:");
        int result = dataReader.getInt();
        dataBase.add(result - sumOfCosts()); //adding tip reduced by costs
        System.out.println("Dodano " + result + " pomniejszone o koszty: " + sumOfCosts());
        System.out.println("\n"); //added in terms of blank line after showing all results

    }

    private void showTips() {
        //using Iterator class (fast iterating) - later change it for lambda
        System.out.println("Twoje napiwki:");
        Iterator<Integer> numIterator = dataBase.getTips().iterator();
        while (numIterator.hasNext()) {
            double tip = numIterator.next();
            System.out.print(tip + "; ");
        }
        System.out.println("\n"); //added in terms of blank line after showing all results
    }

    private void sumTips() {
        int sum = 0;
        for (Integer integer : dataBase.getTips()) {
            sum += integer;
        }
        System.out.println("Suma wszystkich Twoich napiwków to: " + sum);
        System.out.println("\n"); //added in terms of blank line after showing all results

    }

    private void average() {
        int avr = 0;
        int sum = 0;
        for (Integer integer : dataBase.getTips()) {
            sum += integer;
        }
        try {
            avr = sum / dataBase.getTips().size();
        } catch (ArithmeticException ex) {
            // nothing to add here, msg showed below
        }
        System.out.println("Zarobiłeś średnio: " + avr);
        System.out.println("\n"); //added in terms of blank line after showing all results

    }

    private int sumOfCosts() {
        return dataBaseOwner.getBartender() + dataBaseOwner.getDinner() + dataBaseOwner.getSink() + dataBaseOwner.getOther();
    }

    private void exit() {
        System.out.println("Do zobaczenia!");
        dataReader.close();
    }


}
