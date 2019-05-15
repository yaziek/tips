package files;

import user.Person;

import java.io.*;

public class CreateFileDataBase {

    public boolean createFile(String fileName) {

        File file = new File(fileName + ".txt");

        boolean fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
                return false; // <<< exit loop
            } catch (IOException e) {
                System.err.println("Nie udało się utworzyć pliku");
            }
        }

        if (fileExists) {
            System.err.println("Konto o nazwie " + fileName + " już istnieje, wpisz inną ksywkę");
        }
        return true; // stay in the loop and try different fileName
    }

    public void objectWriter(String fileName, Person person){
        try(
            var fs = new FileOutputStream(fileName);
            var os = new ObjectOutputStream(fs);
            ){
            os.writeObject(person);
            System.out.println("Zapisano konto na serwerze");
        }catch (IOException e){
            System.err.println("Błąd zapisu pliku " + fileName);
        }
    }
}
