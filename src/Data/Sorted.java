package Data;

import java.util.*;

public class Sorted {
    public static void main(String[] args) {
        SortedSet<Integer> angka = new TreeSet<>();
        angka.add(90);
        angka.add(89);
        angka.add(60);
        System.out.println(angka);

        NavigableSet<Integer> angka2 = new TreeSet<>();
        NavigableSet<Integer> angka3 = angka2.descendingSet();
        angka2.add(90);
        angka2.add(89);
        angka2.add(60);
        System.out.println(angka3);
    }
}
