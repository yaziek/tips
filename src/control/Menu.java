package control;

import exception.NoSuchOptionException;

public enum Menu {

    EXIT(0, "Wyjście z programu"),
    ADD_TIP(1, "Dodaj swój napiwek"),
    SHOW_TIPS(2, "Pokazuje Twoje napiwki"),
    SUM_TIPS(3, "Wyświetla sumę napiwków"),
    AVG_TIPS(4, "Wyświetla średnią z napiwków"),
    COSTS(5, "Pokazuje Twoje dzienne koszty");

    private final int index;
    private final String description;

    Menu(int index, String description) {
        this.index = index;
        this.description = description;
    }

    public int getIndex() {
        return index;
    }

    public String getDescription() {
        return description;
    }

    static Menu createFromInt(int option) throws NoSuchOptionException {
       try{
           return Menu.values()[option];
       }catch (ArrayIndexOutOfBoundsException ex){
           throw new NoSuchOptionException("Brak opcji o id " + option);
       }
    }

    public static Menu fromDescription(String description) {
        Menu[] choices = values();
        for (Menu choice : choices) {
            if (choice.getDescription().equals(description)) ;
            return choice;
        }
        return null;
    }

    @Override
    public String toString() {
        return index + " - " + description;
    }
}
