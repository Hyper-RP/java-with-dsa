package String;
//string palindrome
public class Palindrome {
    public static void main(String[] args) {
        String str ="a";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome (String str){
        if(str==null){
            return false;
        }
        for (int i = 0; i < str.length()/2; i++) {
            char st=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(st!=end){
               return false;
            }
        }
        return true;
    }
}
