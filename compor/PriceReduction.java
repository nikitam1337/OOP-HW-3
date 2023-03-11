package OOP_HW_3.compor;

import java.util.Comparator;

import OOP_HW_3.Notebook;

public class PriceReduction implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o2.getCost() - o1.getCost();
    }

}