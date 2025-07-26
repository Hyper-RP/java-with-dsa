package Recurrsion;
//find prime number using recursion
public class recursion3 {
    public static void main(String[] args) {
        int num=64;
        int num2=2;
        System.out.println(num+" is prime : "+checkPrime(num,num2));
    }

    public static boolean checkPrime(int num,int num2){
        if(num<=2){
            return false;
        }
        if(num%num2==0){
            return false;
        }
        if(num2*num2>num){
           return true;
        }
        boolean value=checkPrime(num,num2+1);

        return value;
    }
}
