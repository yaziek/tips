package user;

import files.CreateFileDataBase;

import java.util.HashMap;
import java.util.Map;

public class PersonDatabase {

    CreateFileDataBase createFileDataBase = new CreateFileDataBase();

    Map<String, Person> accounts = new HashMap<>();

    public void addAccount(Person person){
        String key = person.getNickname();
        accounts.put(key, person);
        createFileDataBase.objectWriter(key + ".txt", person);
    }

    public Person getPerson(String key){
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
