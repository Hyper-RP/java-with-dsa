package Searching;
//whether the number is exits or not
public class Find_number {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int target=4;
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                System.out.println("available at index "+i);
            }
//            else {
//                System.out.println("not available");
//            }
        }
    }

}
