package array;
////find maximum element in array
public class Max_arr {
    public static void main(String[] args) {
        int []arr={91,2,63,4,55};
        int res=isMaximum(arr);
        System.out.println(res);
    }
    static int isMaximum(int num[]){
        int max=0;
        for (int i = 0; i <num.length ; i++) {
            if(max<num[i]){
                max=num[i];
            }
        }   return max;
    }
}
