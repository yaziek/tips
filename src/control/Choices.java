//Enum type doesnt work for Control.java
// need to go back for it later
// for now, simple static values chooosen
//
//
//
//
package control;

public enum Choices {

    ADD_TIP("1"),  //<<<<<<<<<< here you can change from String to int for better menu overlook
    SHOW_TIPS("2"),
    EXIT("3");

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
