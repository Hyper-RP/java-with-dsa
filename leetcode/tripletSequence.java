//package java;

public class tripletSequence {
    public static void main(String[] args) {
        int[] arr={20,100,10,12,5,13};
        boolean ans=solve(arr);
        System.out.println(ans);
    }

    public static boolean solve(int[] arr){
        int i=0;
        int j=i+1;
        while(j<arr.length-2){
            j=i+1;
            if(arr[i]>=arr[j]){
                i++;
            }
            else if(arr[i]<arr[j]&&arr[j]<arr[j+1]){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
