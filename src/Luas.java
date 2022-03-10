public class Luas {

    private static double luas(float alas, float tinggi){
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

    public static void main(String[] args) {

        System.out.println(luas(20, 25));
        System.out.println(luas(30, 100));
        luas(90, 100);
    }
}
