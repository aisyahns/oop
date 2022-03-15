package DataMap;

import java.util.Map;

public class Immutable {
    public static void main(String[] args) {
        Map<Integer, String> bulan = Map.of(1, "Januari", 2, "Februari", 3, "Maret", 4, "April");
        System.out.println(bulan);
        System.out.println(bulan.get(1));
        System.out.println(bulan.containsKey(2));
        System.out.println(bulan.containsValue("Desember"));
    }
}
