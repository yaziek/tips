package control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {

    Scanner scanner = new Scanner(System.in);

    public void close() {
        scanner.close();
    }

    public int getInt() {
        int number = 0;
        boolean flag = true;
        while (flag) {
            try {
                number = scanner.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                System.err.println("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }

    public String getString() {
        String string = scanner.nextLine();
        return string;
    }

    public String printString(String string){
        return string;
    }
}
