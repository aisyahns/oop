package Data;

import java.awt.desktop.ScreenSleepEvent;
import java.util.*;

public class Linked {
    public static void main(String[] args) {
        List<Integer> angka = new ArrayList<>();
        angka.add(90);
        angka.add(76);
        angka.add(87);
        angka.add(20);
        angka.add(10);
        System.out.println(angka);
        System.out.println(angka.get(3));
        System.out.println(angka.remove(3));

        List<Integer> angka2 = new LinkedList<>();
        var angkaImmutable = Collections.unmodifiableList(angka2);
        System.out.println(angkaImmutable.size());
        angka2.add(90);
        angka2.addAll(angka);
        System.out.println(angka2);
        System.out.println(angka2.get(3));
        System.out.println(angka2.remove(3));
    }
}
