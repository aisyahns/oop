package DataMap;

import java.util.HashMap;
import java.util.Map;

public class Mapped {
    public static void main(String[] args) {
        Map<Integer, String> absen = new HashMap<>();
        absen.put(1, "Raden");
        absen.put(2, "Budi");
        absen.put(3, "Tama");
        absen.put(4, "Zami");
        absen.put(4, "Fikri");

        System.out.println(absen);
        System.out.println(absen.size());
        System.out.println(absen.isEmpty());
        System.out.println(absen.hashCode());
        System.out.println(absen.containsKey(3));
        System.out.println(absen.containsValue("Aisyah"));
        System.out.println(absen.get(4));
        System.out.println(absen.getOrDefault(9, null));
        System.out.println(absen.putIfAbsent(8, "Aldy"));
        System.out.println(absen.remove(4));
        System.out.println(absen.remove(8, "Aisyah"));
        System.out.println(absen);
    }
}
