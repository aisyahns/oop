package Data;

import java.util.ArrayList;
import java.util.Collection;

public class Collect {

    public static void main(String[] args) {
        Collection<Integer> rapor = new ArrayList<>();
        rapor.add(100);
        rapor.remove(90);
        rapor.add(90);
        rapor.add(87);
        System.out.println(rapor);
        System.out.println(rapor.contains(90));
        System.out.println(rapor.contains("Aisyah"));
        System.out.println(rapor.size());

        Object[] raporArr = rapor.toArray();
        for (var i = 0; i < raporArr.length; i++){
            System.out.println(raporArr[i]);
        }

    }
}
