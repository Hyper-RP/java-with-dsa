package hashmap;

import java.util.HashMap;

//Find the first non-repeating character in a string
public class hashmap1 {

    public static void main(String[] args) {
        String str="absabcd";
        nonRepeatingChar(str);
    }

    private static void nonRepeatingChar(String str) {
        HashMap<Character,Integer>map=new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(map);

        for(char ch: map.keySet()){
            if(map.get(ch)==3){
                System.out.println(ch);
            }

        }


    }


}


