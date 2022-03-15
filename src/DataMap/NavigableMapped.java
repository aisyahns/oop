package DataMap;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableMapped {
    public static void main(String[] args) {
        NavigableMap<Integer, String> bulan = new TreeMap<>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");

        System.out.println(bulan);
        System.out.println(bulan.ceilingEntry(2));
        System.out.println(bulan.lowerKey(5));
        System.out.println(bulan.higherEntry(3));
        System.out.println(bulan);
    }
}
