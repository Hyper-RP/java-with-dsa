package basic;

import java.util.Stack;

public class main67 {
    public static void main(String[] args) {
        String str="reohita";
        String ans= getVovels(str);
        System.out.println("final string : "+ans);
    }

    public static String getVovels(String str){

        String temp=new StringBuffer(str).reverse().toString();

        String vovelString="";
        for (int i = 0; i < str.length(); i++) {
            switch (temp.charAt(i)){
                case 'a':vovelString=vovelString+temp.charAt(i);
                        break;
                case 'e':vovelString=vovelString+temp.charAt(i);
                    break;
                case 'i':vovelString=vovelString+temp.charAt(i);
                    break;
                case 'o':vovelString=vovelString+temp.charAt(i);
                    break;
                case 'u':vovelString=vovelString+temp.charAt(i);
                    break;
            }
        }


        return vovelString;
    }
}
