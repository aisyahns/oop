package Data;

import java.util.ArrayList;
import java.util.List;

public class Parse {

    public static void main(String[] args) {
        String data = "76523752";
        List<Integer> data2 = new ArrayList<>();

        for (var i = 0; i< data.length(); i++){
            Integer x = Integer.parseInt(String.valueOf(data.charAt(i)));
            data2.add(x);
        }

        System.out.println(data2);
    }
}
