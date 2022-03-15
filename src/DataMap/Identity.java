package DataMap;

import java.util.IdentityHashMap;
import java.util.Map;

public class Identity {
    public static void main(String[] args) {
        Map<String, Integer> bulan = new IdentityHashMap<>();
        var key = "Januari.Awal";
        var awal = "Awal";
        var key2 = "Januari"+ "." + awal;
        bulan.put(key, 1);
        bulan.put(key2, 1);
        bulan.put("Agustus", 8);

        System.out.println(bulan);
        System.out.println(bulan.get("Januari.Awal"));
        System.out.println(bulan.putIfAbsent("Agustus", 8));
        System.out.println(bulan.getOrDefault("Januari.Awal", null));
        System.out.println(bulan.containsValue(1));
        System.out.println(bulan.containsKey("Januari.Awal"));
        System.out.println(bulan.replace("Januari.Awal", 10));
        System.out.println(bulan.replace("Januari.Awal", 10, 90));
        System.out.println(bulan.replace("Januari.Awal", 1, 87));
        System.out.println(bulan);
    }
}
