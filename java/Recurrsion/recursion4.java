package Recurrsion;

public class recursion4 {
    public static void main(String[] args) {
        int num=8;
        int res=myFibo(num);
        System.out.println(res);

    }

    public static int myFibo(int num){
        if(num==0){
          return 0;
        }
        if(num==1){
            return 1;
        }
       int res= myFibo(num-1)+myFibo(num-2);
       return res;
    }

}
