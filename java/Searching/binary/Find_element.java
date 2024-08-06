package Searching.binary;
//find element in array using binary search
public class Find_element {
    public static void main(String[] args) {
        int []num={100,90,80,70,60,50,40,30,20,10};
//        int []num={11,22,33,44,55,66,77,88,99,100};
        int n=66;
        int res=ischeck(num,n);
        System.out.println(res);
    }
    //if element is found return the index of element
    //otherwise return -1
    static int ischeck(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[start]<arr[end]){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else {
                    return mid;
                }
            }
            if(arr[start]>arr[end]){
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
                else {
                    return mid;
                }
            }

        }
        return -1;
    }
}
