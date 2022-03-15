package DataMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakMapped {
    public static void main(String[] args) {
        Map<Integer, String> bulan = new WeakHashMap<>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(5, "Juni");

        System.out.println(bulan);
        System.out.println(bulan.size());
        System.out.println(bulan.get(5));
        System.out.println(bulan.remove(4, "April"));
        System.out.println(bulan.putIfAbsent(12, "December"));
        System.out.println(bulan);
    }
}
