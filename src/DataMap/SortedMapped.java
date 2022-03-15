package DataMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapped {
    public static void main(String[] args) {
        SortedMap<Integer, String> bulan = new TreeMap<>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(5, "Mei");
        bulan.put(3, "Maret");
        bulan.put(4, "April");

//        System.out.println(bulan);
//        System.out.println(bulan.size());
//        System.out.println(bulan.get(4));
//        System.out.println(bulan.containsKey(2));
//        System.out.println(bulan.containsValue("April"));
//        System.out.println(bulan.comparator());
//        System.out.println(bulan.put(12, "Desember"));
//        System.out.println(bulan);

        SortedMap<Person, Integer> persons = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        persons.put(new Person("Morkyu", 11, "perempuan"), 1);
        persons.put(new Person("Alterra", 90, "laki-laki"), 2);
        persons.put(new Person("Academy", 54, "perempuan"), 3);

        for (var key:persons.entrySet()){
            System.out.println(key.getKey().getName());
//            System.out.println(key.getKey().getJenisKelamin());
//            System.out.println(key.getKey().getUmur());
        }
    }
}
