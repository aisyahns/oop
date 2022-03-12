package Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterate {

    public static void main(String[] args) {
        Iterable<Integer> rapor = List.of(100, 80, 70, 60, 95);
        Iterable<Integer> rapor2 = List.of(100, 80, 70, 60, 95);
        System.out.println(rapor);

        for (var angka: rapor){
            System.out.println(angka);
        }//for var i, i++, tapi di suatu array yang punya method length

        Iterator<Integer> it = rapor.iterator();
        while(it.hasNext()){
            Integer number = it.next();
            System.out.println(number);
        }//for each

    }
}
