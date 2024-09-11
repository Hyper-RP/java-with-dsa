package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class main57 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,100);
        System.out.println(list);
        System.out.println(list.size());

    }
}
