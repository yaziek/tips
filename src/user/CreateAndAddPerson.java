package user;

public class CreateAndAddPerson {

    PersonCreator personCreator = new PersonCreator();
    PersonDatabase personDatabase = new PersonDatabase();

    public void createAndAddPerson(){
        Person person = personCreator.createPerson();
        personDatabase.addPerson(person);
    }
}
