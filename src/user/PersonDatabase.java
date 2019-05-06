package user;

import java.util.HashMap;
import java.util.Map;

public class PersonDatabase {

    Map<String, Person> accounts = new HashMap<>();

    public boolean addAccount(Person person){
        String key = person.getNickname();

        if (accounts.get(key) != null){
            return false;
        }else {
            accounts.put(key, person);
            return true;
        }
    }

}
