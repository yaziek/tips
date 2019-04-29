package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase {

    List<Integer> tips = new ArrayList<>();

    public void add(int tip){
        tips.add(tip);
    }

    public void show(){
        //using Iterator class (fast iterating) - later change it for lambda
        Iterator<Integer> numIterator = tips.iterator();
        while(numIterator.hasNext()){
            int tip = numIterator.next();
            System.out.println(tip);
        }
    }
}
