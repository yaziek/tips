package control;

import java.util.Scanner;

public class DataReader {

    Scanner scanner = new Scanner(System.in);

    public void close(){
        scanner.close();
    }

    public int getInt(){
        int number = scanner.nextInt();
        return number;
    }


}
