package DataMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkMapped {
    public static void main(String[] args) {
        Map<Integer, String> bulan = new LinkedHashMap<>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");

        System.out.println(bulan);
        System.out.println(bulan.size());
        System.out.println(bulan.get(2));
        System.out.println(bulan.containsValue("Maret"));
        System.out.println(bulan.containsKey(4));
        System.out.println(bulan.putIfAbsent(12, "Desember"));
        System.out.println(bulan);
    }
}
