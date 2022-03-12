package Data;

import java.util.ArrayList;
import java.util.List;

public class ArrList {

    public static void main(String[] args) {
        ArrayList<Integer> rapor = new ArrayList<>();
        rapor.add(78);
        rapor.add(90);
        System.out.println(rapor);
        rapor.add(2, 89);
        rapor.remove(2);
        System.out.println(rapor);

        List<Integer> rapor2 = new ArrayList<>();
        rapor2.add(78);
        rapor2.add(90);
        rapor2.add(90);
        rapor2.add(78);
        System.out.println(rapor2);
    }
}
