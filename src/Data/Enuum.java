package Data;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class Enuum {

    enum tinggi {
        TINGGI, SEDANG, PENDEK
    } //kategori yang bisa diurutkan

    public static void main(String[] args) {
        Set<tinggi> set = EnumSet.allOf(tinggi.class);

        System.out.println(set);
        Iterator<tinggi> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
