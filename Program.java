package OOP_HW_3;

import java.util.ArrayList;
import java.util.Comparator;

import OOP_HW_3.compor.IncreaseSSD;
import OOP_HW_3.compor.PriceReduction;
import OOP_HW_3.compor.RamReduction;

public class Program {
    public static void main(String[] args) {
        Comparator<Notebook> PriceReduction = new PriceReduction();
        Comparator<Notebook> RamReduction = new RamReduction();
        Comparator<Notebook> IncreaseSSD = new IncreaseSSD();

        Notebook notebook1 = new Notebook(80000, 16, 500);
        Notebook notebook2 = new Notebook(60000, 8, 240);
        Notebook notebook3 = new Notebook(120000, 32, 1000);
        Notebook notebook4 = new Notebook(100000, 32, 1000);
        Notebook notebook5 = new Notebook(30000, 6, 120);
        Notebook notebook6 = new Notebook(60000, 6, 240);

        ArrayList<Notebook> notebooks = new ArrayList<>();

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);

        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        System.out.println("");

        // notebooks.sort(null);
        // notebooks.sort(PriceReduction);
        // notebooks.sort(RamReduction);
        notebooks.sort(IncreaseSSD);


        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }

    }
}