package user;

import control.DataReader;

public class PersonCreator {

    DataReader dataReader = new DataReader();

    public Person createPerson() {
        System.out.println("Podaj swoją ksywkę w pracy:");
        String nickname = dataReader.getString();
        System.out.println("Jak masz na imię:"); // add option to choose: nickname or name
        String firstName = dataReader.getString();
        System.out.println("Jak masz na nazwisko:"); // add option: give last name or skip it
        String lastName = dataReader.getString();
        System.out.println("Jaką masz stawkę godzinową (netto):");
        int wage = dataReader.getInt();
        System.out.println("Ile płacisz barmanowi:"); //add option YES or NOT
        int bartender = dataReader.getInt(); // add percentage option
        System.out.println("Srednio ile dziennie wydajesz na posiłki:");
        int dinner = dataReader.getInt();
        System.out.println("Ile płacisz na zmywak:");
        int sink = dataReader.getInt();
        System.out.println("Dodatkowe dzienne koszty:");
        int other = dataReader.getInt();

        return new Person(nickname, firstName, lastName, wage, bartender, dinner, sink, other);
    }
}
