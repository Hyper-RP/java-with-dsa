package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class main61 {
    public static void main(String[] args) {

        String []arr=new String[5];

        ArrayList<String> names=new ArrayList<>();
        names.add("Rohit");
        names.add("Tejas");
        names.add("Om");
        names.add("Jay");
        names.add("Bablya");

        System.out.println(names);
        ArrayList<String> naam=(ArrayList<String>) names.clone();
        naam.set(0,"tejas");

        System.out.println(naam);

        System.out.println(names);
    }
}










