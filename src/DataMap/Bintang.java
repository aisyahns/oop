package DataMap;

public class Bintang {
    public static void main(String[] args) {
        Integer input = 7;

        for (var i = 0; i < input; i++){
            for (var k = 0; k < i; k++){
                System.out.print(" ");
            }

            int batas = input*2-1 - i;
            int tambah = i;
            for (var j = i; j< input*2-1; j++){
                if (j > batas){
                    System.out.print(" ");
                } else if (j == i){
                    System.out.print("*");
                    tambah+=2;
                } else if (j == (tambah)){
                    System.out.print("*");
                    tambah+=2;
                }
                else System.out.print(" ");
            }

            System.out.println();
        }
    }


}
