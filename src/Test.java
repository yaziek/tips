// Class for tests
// Class for tests
// Class for tests
// Class for tests
// Class for tests
// Class for tests
// Class for tests

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    Scanner scanner = new Scanner(System.in);

    private void getOption() {
        boolean optionOk = false;
        int opt = 0;
        while (!optionOk) {
            try {
                opt = scanner.nextInt();
                optionOk = true;
            } catch (InputMismatchException ex) {
                System.err.println("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }
    }

    public int testingWhile(){
        int i = 0;

        while (i < 5){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {

        Test test = new Test();

        test.testingWhile();

        System.out.println(test.testingWhile());


    }

}
