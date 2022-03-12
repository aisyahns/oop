package Data;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

public class Abstract {

    public static void main(String[] args) {
        AbstractCollection<String> angka = new AbstractCollection<String>() {
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };

        System.out.println(angka.size());
    }
}
