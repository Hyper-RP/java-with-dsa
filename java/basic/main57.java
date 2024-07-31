package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class main57 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for (int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j=0;j<3;j++) {
                (list.get(i)).add(input.nextInt());
            }
        }
        System.out.println(list);
//        System.out.println(list);
//        System.out.println(list.remove(1));
//        System.out.println(list);
//        System.out.println(list.get(1));
//        list.add(10);
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//        list.add(16);
//        System.out.println(list);
//        System.out.println(list.contains(12));
//        System.out.println(list.get(1));
//        System.out.println(list.set(0,100));
//        System.out.println(list);
//        System.out.println(list.remove(0) );
//        System.out.println(list);
//        System.out.println(list.get(0));

    }
}
