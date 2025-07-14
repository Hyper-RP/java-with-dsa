package Recurrsion;

public class recurrsion1 {
    public static void main(String[] args) {
        int n=5;
        myFun(n);
    }

    public static int myFun(int n){
        if(n==0){
            System.out.println("recurrsion stops");
            return 1;
        }
        else{
           int res= n*myFun(n-1);
           System.out.println("res : "+res);
           return res;
        }

    }

}
