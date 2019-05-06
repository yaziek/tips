package user;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PersonDatabase {

    Map<String, Person> personDatabase = new HashMap<>();

    public void addPerson(Person person){
        personDatabase.put(person.nickname, person);
    }
}
