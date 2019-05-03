package user;

import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    double wage;
    double bartender;
    double dinner;
    double sink;
    double other;

    public Person(String firstName, String lastName, double wage, double bartender, double dinner, double sink, double other) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
        this.bartender = bartender;
        this.dinner = dinner;
        this.sink = sink;
        this.other = other;
    }

    public Person(){

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

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getBartender() {
        return bartender;
    }

    public void setBartender(double bartender) {
        this.bartender = bartender;
    }

    public double getDinner() {
        return dinner;
    }

    public void setDinner(double dinner) {
        this.dinner = dinner;
    }

    public double getSink() {
        return sink;
    }

    public void setSink(double sink) {
        this.sink = sink;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.wage, wage) == 0 &&
                Double.compare(person.bartender, bartender) == 0 &&
                Double.compare(person.dinner, dinner) == 0 &&
                Double.compare(person.sink, sink) == 0 &&
                Double.compare(person.other, other) == 0 &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, wage, bartender, dinner, sink, other);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wage=" + wage +
                ", bartender=" + bartender +
                ", dinner=" + dinner +
                ", sink=" + sink +
                ", other=" + other +
                '}';
    }
}
