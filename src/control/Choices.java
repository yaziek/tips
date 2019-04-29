package control;

public enum Choices {

    ONE("dodaj"),  //<<<<<<<<<< here you can change from String to int for better menu overlook
    TWO("wynik"),
    THREE("koniec");

    private final String description;

    Choices(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static Choices fromDescription(String description){
        Choices[] choices = values();
        for (Choices choice : choices) {
            if(choice.getDescription().equals(description));
            return choice;
        }
        return null;
    }
}
