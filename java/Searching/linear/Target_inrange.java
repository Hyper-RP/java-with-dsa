package Searching.linear;
//search the target in a given reange.
//if target found return true otherwise return false
public class Target_inrange {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int target=4;
        int i=1;
        int n=5;
        boolean res=search(arr,target,i,n);
        System.out.println(res);
    }
    static boolean search(int []num,int target,int start,int end){
       if(num.length==0){
           return false;
       }
        for (int i = start; i < end; i++) {
            if (target==num[i]){
                return true;
            }
        }
        return false;
    }
}
