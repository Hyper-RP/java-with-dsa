package basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class main72 {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(30);
        queue.add(20);
        queue.add(10);
        queue.add(40);
        int[] arr=queue.stream().mapToInt(Integer::intValue).toArray();
        System.out.println( queue.size());
        System.out.println(Arrays.toString(arr));
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
