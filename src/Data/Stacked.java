package Data;

import java.util.Stack;

public class Stacked {
    public static void main(String[] args) {
        Stack<String> makanan = new Stack<>();
        makanan.push("batagor");
        makanan.push("nasi goreng");
        makanan.push("jelly");
        System.out.println(makanan.pop());
        System.out.println(makanan);
        System.out.println(makanan.peek());
        System.out.println(makanan);
    }
}
