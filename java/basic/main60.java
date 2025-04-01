package basic;

import java.util.Arrays;

public class main60 {
    public static void main(String[] args) {
        int []arr={1,4,3,2};
        int []res=ans(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] ans(int []arr){

        int pivotIndex=findPivot(arr);
        System.out.println("pivot index is : "+pivotIndex);
        System.out.println("pivot element is : "+arr[pivotIndex]);
        if(pivotIndex==-1){
            swap(arr,0,arr.length-1,0);
            return arr;
        }

        int maxElementIndex=maxElement(arr,pivotIndex,arr.length-1);


        swap(arr,pivotIndex,maxElementIndex,arr.length-1);

        swap(arr,pivotIndex+1,arr.length-1,0);

        return arr;

    }

    public static int findPivot(int arr[]) {

    }

    public static void swap(int arr[],int start,int end,int swapCount){
        while(start<end&swapCount< arr.length){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            swapCount++;
        }
    }

    public static int maxElement(int arr[],int first,int last){
        int pivot=arr[first];
        int max=0;
        int index=0;
        while(first<last){
            if(arr[first+1]>pivot){
                max=arr[first+1];
                index=first+1;
            }
                first++;
        }
        System.out.println("closest max element to pivot is : "+arr[index]);

        return index;
    }
}
