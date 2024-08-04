package Searching;
//whether the number is exits or not
public class Find_number {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int target=4;
       int res= linearsearch(arr,target);
//        System.out.println(res);
    }
    static int linearsearch(int []num,int target) {
        if (num.length == 0) {
            return -1;
        }
        for (int i = 0; i < num.length; i++) {
            if (target == num[i])
                return i;
        }
        return -1;
    }

}
