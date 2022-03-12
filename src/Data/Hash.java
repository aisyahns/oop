package Data;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hash {

    public static void main(String[] args) {
        Set<Integer> angka = new HashSet<>();
        angka.add(90);
        angka.add(80);
        angka.add(60);
        angka.add(90);
        angka.add(70);
        angka.add(60);
        System.out.println(angka);
        System.out.println(angka.hashCode());
        System.out.println(angka.contains(90));
        System.out.println(angka.remove(90));
        System.out.println(angka);

        Set<Integer> angka2 = new LinkedHashSet<>();
        angka2.add(90);
        angka2.add(80);
        angka2.add(60);
        angka2.add(90);
        angka2.add(70);
        angka2.add(60);
        System.out.println(angka2);
        System.out.println(angka2.hashCode());
        System.out.println(angka2.contains(90));
        System.out.println(angka2.remove(90));
        System.out.println(angka2);
    }
}
