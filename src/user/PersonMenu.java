package user;

import control.DataReader;

import java.util.Set;

public class PersonMenu {

    PersonDatabase personDatabase = new PersonDatabase();
    DataReader dataReader = new DataReader();
    CreateAndAddPerson createAndAddPerson = new CreateAndAddPerson();
    PersonCreator personCreator = new PersonCreator();

    public static final int EXIT = 0;
    public static final int LOG_IN = 1;
    public static final int ADD_ACCOUNT = 2;
    public static final int REMOVE_ACCOUNT = 3;

    public void personMenuControl() {
        int option;
        do {
            welcome();
            option = dataReader.getInt();
            switch (option) {
                case LOG_IN:
                    logIn();
                    break;
                case ADD_ACCOUNT:
//                  createAndAddPerson.createAdd(); <<<<< why does it not work????????
                    Person p1 = personCreator.createPerson();
                    personDatabase.addAccount(p1);
//                    personDatabase.accounts.put(p1.getNickname(), p1);
                    break;
                case REMOVE_ACCOUNT:
                    removeAccount();
                    break;
            }
        } while (option != EXIT);
    }

    private void removeAccount() {
        System.out.println("Które konto chcesz skasować:");
        personDatabase.accounts.values();
        String nickname = dataReader.getString();
        personDatabase.accounts.remove(nickname);
        System.out.println("Usunięto konto: " + nickname);
    }

    private void logIn() {
        System.out.println("Wpisz jedną z dostępnych ksywek:");
        Set<String> keys = personDatabase.accounts.keySet();
        for (String key : keys) {
            if (key.equals(null)) {
                System.err.println("Nie ma żadnych aktywnych użytkowników.");
            } else {
                System.out.println(key);
            }
        }
        String nickname = dataReader.getString();
        System.out.println(personDatabase.accounts.get(nickname));
    }

    private void welcome(){
        System.out.println("Co chcesz zrobić:");
        System.out.println(LOG_IN + " - zaloguj się na swoje konto");
        System.out.println(ADD_ACCOUNT + " - dodaj nowe konto");
        System.out.println(REMOVE_ACCOUNT + " - usuń istniejące konto");
        System.out.println(EXIT + " - wyjście z programu");
    }


}
