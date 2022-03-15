package DataMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapIndex {

    public static void main(String[] args) {
        Map<Points, Character> table = new LinkedHashMap<>();

        char initial = 'A';
        for (int i = 1; i < 6; i ++){
            for (int j = 1; j < 6; j ++){
                if (i > 2){
                    initial += 1;
                    table.put(new Points(i, j), Character.valueOf(initial));
                } else {
                    table.put(new Points(i, j), Character.valueOf(initial));
                    initial += 1;
                }
            }
        }

        char search = 'R';
        if (search == 'K'){
            System.out.println("3 1");
        } else {
            for (var tab: table.entrySet()){
                if (tab.getValue().equals(search)){
                    System.out.print(tab.getKey().getY());
                    System.out.print(" ");
                    System.out.println(tab.getKey().getX());
                }
            }
        }
    }
}
