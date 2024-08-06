package Searching.linear;
//find numbers that have even no.of digits and if it is even return true or false
public class Even_no_digits {
    public static void main(String[] args) {
        boolean res= ischeck(1235);
        System.out.println(res);
    }
    static boolean ischeck(int num){

       if(even(num)%2==0){
          return true;
       }
       return false;
    }
    static int even(int n){
        if(n<0){
            n=n*-1;
        }
        int count=1;
        for (int i = 0; 0 < n; i++) {
            n=n/10;
            count++;
        }
        return n;
    }
}
