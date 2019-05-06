// Class for tests
// Class for tests
// Class for tests
// Class for tests
// Class for tests
// Class for tests
// Class for tests

import user.CreateAndAddPerson;
import user.Person;
import user.PersonCreator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        PersonCreator personCreator = new PersonCreator();
        CreateAndAddPerson createAndAddPerson = new CreateAndAddPerson();

        Map<String, Person> list = new HashMap<>();

        Person p1 = personCreator.createPerson();

        list.put(p1.getNickname(), p1);

        Set<String> nicknames = list.keySet();
        for (String nickname : nicknames) {
            System.out.println(nickname);
        }


    }

}
