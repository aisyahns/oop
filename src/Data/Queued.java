package Data;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queued {
    public static void main(String[] args) {
        Queue<Integer> angka = new PriorityQueue<>();
        angka.offer(90);
        angka.offer(87);
        angka.offer(67);
        System.out.println(angka);
        System.out.println(angka.poll());
        System.out.println(angka);
    }
}
