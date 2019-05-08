package user;

import java.util.HashMap;
import java.util.Map;

public class PersonDatabase {

    Map<String, Person> accounts = new HashMap<>();

    /* TODO
    *   can not add multiple accounts, only one account avaible at the time
    * */
    public void addAccount(Person person){
        String key = person.getNickname();
        accounts.put(key, person);
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
