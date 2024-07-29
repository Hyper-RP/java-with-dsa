/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * to check palindrome , insert value in x variable.
 */

public class int_palindrome {
    
        public static boolean isPalindrome(int x) {
            int temp=x;
            int modulo=x;
            int res=0;
            for(int i=0;0<modulo;i++){
                temp=modulo%10;
                res=res*10+temp;
                modulo=modulo/10; 
            }
              if(res==x){
                System.out.println("true");
                    return true;
                }
                else
                return false;
            // return(res==x);
        }
        public static void main(String[] args) {
            isPalindrome(121);
        }
    }

