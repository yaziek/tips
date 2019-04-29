package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase {

    List<Double> tips = new ArrayList<>();

    public void add(Double tip){
        tips.add(tip);
    }

    public void show(){
        //using Iterator class (fast iterating) - later change it for lambda
        Iterator<Double> numIterator = tips.iterator();
        while(numIterator.hasNext()){
            double tip = numIterator.next();
            System.out.println(tip);
        }
    }
}
