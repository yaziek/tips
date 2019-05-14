package user;

import java.util.HashMap;
import java.util.Map;

public class PersonDatabase {

    Map<String, Person> accounts = new HashMap<>();

    public void addAccount(Person person){
        String key = person.getNickname();
        accounts.put(key, person);
    }

    public Person logInToAccount(String key){
        return accounts.get(key);
    }

//    public boolean addAccount(Person person){
//        String key = person.getNickname();
//        if (accounts.get(key) != null){
//            return false;
//        }else {
//            accounts.put(key, person);
//            return true;
//        }
//    }

}
