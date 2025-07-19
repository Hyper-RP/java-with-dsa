package basic;

//reverse a string and remove present vovels from string

import java.sql.Array;
import java.util.*;

public class main64 {
    public static void main(String[] args) {
        String str="paatilRRooh";
        char ans= removeVovels(str);
        System.out.println("final string : "+ans);
    }


    public static char removeVovels(String string1){
        HashMap<Character,Integer>map=new LinkedHashMap<>();
        HashSet<Character> set=new LinkedHashSet<>();

        for (int i = 0; i < string1.length(); i++) {
             map.put(string1.charAt(i),map.getOrDefault(string1.charAt(i),0)+1);
        }

        System.out.println("map : "+map);
        int index=0;
        for (int j = 0; j < map.size(); j++) {
            char ch=string1.charAt(string1.length()-(j+1));
            int count=map.get(ch);
            if(count==2){
              set.add(ch);
            }

        }

        System.out.println("list : "+set);

        int tempIndex=0;
        for(char charcter :set){
            tempIndex++;
            if(tempIndex==2){
              return charcter;
            }
        }


        return '-';
    }
}
