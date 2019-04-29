package control;

public enum Choices {

    ONE("dodaj"),
    TWO("wynik"),
    THREE("koniec");

    private final String description;

    Choices(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
