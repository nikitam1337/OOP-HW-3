package OOP_HW_3.compor;

import java.util.Comparator;

import OOP_HW_3.Notebook;

public class RamReduction implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        if (o1.getRam() < o2.getRam()) {
            return 1;
        } else if (o1.getRam() == o2.getRam()) {
            if (o1.getCost() == o2.getCost()) {
                return 0;
            } else if (o1.getCost() < o2.getCost()) {
                return 1;
            }
        }
        return -1;
    }

}