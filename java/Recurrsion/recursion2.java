package Recurrsion;
//sum of n numbers from 1 to n
public class recursion2 {
    public static void main(String[] args) {
        int num=5;
        int res= recursion(num);
        System.out.println(res);
    }

    public static int recursion(int num){
        if(num==0){
            return 0;
        }
        int res=num+recursion(num-1);
        System.out.println("in recursion res : "+res);
        return res;
    }

}
