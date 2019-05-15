package user;

import java.util.Objects;

public class Person {

    private String nickname;
    private String firstName;
    private String lastName;
    private int wage;
    private int bartender;
    private int dinner;
    private int sink;
    private int other;

    public Person(String nickname, String firstName, String lastName, int wage, int bartender, int dinner, int sink, int other) {
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
        this.bartender = bartender;
        this.dinner = dinner;
        this.sink = sink;
        this.other = other;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getBartender() {
        return bartender;
    }

    public void setBartender(int bartender) {
        this.bartender = bartender;
    }

    public int getDinner() {
        return dinner;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }

    public int getSink() {
        return sink;
    }

    public void setSink(int sink) {
        this.sink = sink;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nickname='" + nickname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wage=" + wage +
                ", bartender=" + bartender +
                ", dinner=" + dinner +
                ", sink=" + sink +
                ", other=" + other +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return wage == person.wage &&
                bartender == person.bartender &&
                dinner == person.dinner &&
                sink == person.sink &&
                other == person.other &&
                Objects.equals(nickname, person.nickname) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, firstName, lastName, wage, bartender, dinner, sink, other);
    }
}
