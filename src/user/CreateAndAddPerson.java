package user;

public class CreateAndAddPerson {

    PersonCreator personCreator = new PersonCreator();
    PersonDatabase personDatabase = new PersonDatabase();

    public void createAdd(){
        Person p1 = personCreator.createPerson();
        personDatabase.accounts.put(p1.getNickname(), p1);
    }
}
