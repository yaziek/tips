package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DataBase {



    List<Integer> tips = new ArrayList<>();

    public List<Integer> getTips() {
        return tips;
    }

    public void add(int tip){
        tips.add(tip);
    }
}
