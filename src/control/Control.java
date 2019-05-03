package control;
import data.DataBase;
import java.util.Iterator;

import static control.Menu.createFromInt;

public class Control {

    DataBase dataBase = new DataBase();
    DataReader dataReader = new DataReader();

    public void mainControlPanel() {
        Menu option; //help value for Control Loop
        do {
            showMenu();
            option = createFromInt(dataReader.getInt());
            switch (option) {
                case ADD_TIP:
                    addTip();
                    break;
                case SHOW_TIPS:
                    showTips();
                    break;
                case SUM_TIPS:
                    sumTips();
                    break;
                case AVG_TIPS:
                    average();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.err.println("Nie ma takiej opcji, wprowadź ponownie:");
            }
        } while (!option.equals(Menu.EXIT));
    }

        private void showMenu () {
            System.out.println("Wpisz co chcesz zrobić, dostępne opcje:");
           for(Menu menu: Menu.values()){
               System.out.println(menu.toString());
           }
        }

        public void addTip () {
            System.out.println("Podaj swój wynik:");
            int result = dataReader.getInt();
            dataBase.add(result);
            System.out.println("Dodano " + result);
            System.out.println("\n"); //added in terms of blank line after showing all results

        }

        public void showTips () {
            //using Iterator class (fast iterating) - later change it for lambda
            System.out.println("Twoje napiwki:");
            Iterator<Integer> numIterator = dataBase.getTips().iterator();
            while (numIterator.hasNext()) {
                int tip = numIterator.next();
                System.out.print(tip + "; ");
            }
            System.out.println("\n"); //added in terms of blank line after showing all results
        }

        public void sumTips () {
            int sum = 0;
            for (Integer integer : dataBase.getTips()) {
                sum += integer;
            }
            System.out.println("Suma wszystkich Twoich napiwków to: " + sum);
            System.out.println("\n"); //added in terms of blank line after showing all results

        }

        public void average () {
            int sum = 0;
            for (Integer integer : dataBase.getTips()) {
                sum += integer;
            }
            int avr = sum / dataBase.getTips().size();
            System.out.println("Zarobiłeś średnio: " + avr);
            System.out.println("\n"); //added in terms of blank line after showing all results

        }

        private void exit () {
            System.out.println("Do zobaczenia!");
            dataReader.close();
        }


    }
