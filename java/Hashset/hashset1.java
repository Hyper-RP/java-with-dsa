package Hashset;

import java.util.HashSet;

//Longest Substring Without Repeating Characters
public class hashset1 {
    public static void main(String[] args) {
        String str="abcc";
        longestSubstring(str);
    }

    public static void longestSubstring(String str){
        HashSet<Character>set=new HashSet<>();
        int left=0;
        int right=0;
        int maxLength=0;
        int start=0;

        while (right<str.length()){
            char currChar=str.charAt(right);

            while (set.contains(currChar)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(currChar);

            if(right-left+1>maxLength){
               maxLength=right-left+1;
               start=left;
            }
            right++;
        }

        System.out.println("maxlength : "+maxLength);
        System.out.println("start : "+start);

        for (int j = start; j < start+maxLength; j++) {
            System.out.print(" "+str.charAt(j));
        }

    }

}
