package OOP_HW_3.compor;

import java.util.Comparator;

import OOP_HW_3.Notebook;

public class IncreaseSSD implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o1.getSSD() - o2.getSSD();
    }
}
