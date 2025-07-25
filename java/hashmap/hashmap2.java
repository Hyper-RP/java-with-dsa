package hashmap;

import java.util.HashSet;

//Longest Substring Without Repeating Characters
public class hashmap2 {
    public static void main(String[] args) {
        String str="abcbcad";
        myFun(str);
    }
    
    public static void myFun(String str){

        HashSet<Character>set=new HashSet<>();
        int left=0;
        int right=0;
        for (int i = 0; i <str.length() ; i++) {
            if(!set.contains(str.charAt(right))){
                set.add(str.charAt(i));
                right++;
            }
            else {
                set.remove(str.charAt(left));
                left++;
            }
            System.out.println(set);
        }

        
    }
}
