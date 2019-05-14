package user;

import control.DataReader;

import java.util.Set;

public class PersonMenu {

    PersonDatabase personDatabase = new PersonDatabase();
    DataReader dataReader = new DataReader();
    CreateAndAddPerson createAndAddPerson = new CreateAndAddPerson();
    PersonCreator personCreator = new PersonCreator();

    public static int OPTION;
    public static final int EXIT = 0;
    public static final int LOG_IN = 1;
    public static final int ADD_ACCOUNT = 2;
    public static final int REMOVE_ACCOUNT = 3;

    public Person personMenuControl() {
        Person person = null;
        do {
            welcome();
            OPTION = dataReader.getInt();
            switch (OPTION) {
                case LOG_IN:
//                    logIn();
                    person = personDatabase.getPerson(logIn());
                    /*TODO
                     *  create class which check if the person is created or not*/
                    break;
                case ADD_ACCOUNT:
//                  createAndAddPerson.createAdd(); <<<<< why does it not work????????
                    Person p1 = personCreator.createPerson();
                    personDatabase.addAccount(p1);
                    break;
                case REMOVE_ACCOUNT:
                    removeAccount();
                    break;
                default:
                    System.err.println("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
                    System.out.println();
                    break;
            }
        } while (OPTION != EXIT);

        return person;
    }

    private void removeAccount() {
        Set<String> accounts = personDatabase.accounts.keySet();
        if (accounts.size() == 0) {
            System.err.println("Nie ma żadnych aktywnych użytkowników.");
            System.out.println();
        } else {
            System.out.println("Które konto chcesz skasować:");

            for (String account : accounts) {
                System.out.println(account);
            }
            String nickname = dataReader.getString();
            for (String account : accounts) {
                if (account.equals(nickname)) {
                    personDatabase.accounts.remove(nickname);
                    System.out.println("Usunięto konto: " + nickname);
                } else {
                    System.out.println("Nie znaleziono takiego konta");
                }
            }

        }
    }

    private String logIn() {
        String nickname = null;
        Set<String> accounts = personDatabase.accounts.keySet();
        if (accounts.size() == 0) {
            System.err.println("Nie ma żadnych aktywnych użytkowników.");
            System.out.println();
            OPTION = OPTION; // <<< stay in the PersonMenu loop
        } else {
            System.out.println("Wpisz jedną z dostępnych ksywek:");
            for (String key : accounts) {
                System.out.println(key);
            }
            nickname = dataReader.getString();
            /* TODO
             *   create connection between created account and later calculations*/
            for (String account : accounts) {
                if (account.equals(nickname)) {
                    System.out.println("Zalogowano się na koncie " + nickname);
                    OPTION = 0; // <<< exit PersonMenu loop
                } else {
                    /*
                     TODO
                    shows messagge twice, why?
                    */
                    System.err.println("Nie ma takiego konta");
                }
            }
        }
        return nickname;
    }

    private void welcome() {
        System.out.println("Co chcesz zrobić:");
        System.out.println(LOG_IN + " - zaloguj się na swoje konto");
        System.out.println(ADD_ACCOUNT + " - dodaj nowe konto");
        System.out.println(REMOVE_ACCOUNT + " - usuń istniejące konto");
        System.out.println(EXIT + " - wyjście z programu");
    }


}
