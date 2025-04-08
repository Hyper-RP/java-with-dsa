package basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class majorityElement {
    public static void main(String[] args) {
        int arr[]={3 ,2, 1, 1, 2, 3, 4, 1, 4, 4, 4, 1, 3, 1, 2, 1};
        System.out.println(majorityElement(arr));
    }

    public static ArrayList<Integer> majorityElement(int []arr){
        int quantity=(int)Math.floor(arr.length/3);
        int count=1;
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=1;i<arr.length;i++){

            if(count==quantity){
                temp.add(arr[i]);
                count=1;
            }

            else if( arr[i-1]==arr[i]){
                count++;
            }
             else{
                 count--;
            }


//            System.out.println(temp.size());
//            System.out.println(arr.length);

        }
        Collections.sort(temp);
        return temp;
    }
}
