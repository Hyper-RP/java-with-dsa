
//just a program to find pivot element
public class pivot {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int res =findPivot(arr);
        System.out.println(res);
    }
    //will work for dupicates and negative also
      public static int findPivot(int []arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr.length==1){
                return arr[0];
            }
            //if array contains any duplicates elements
            if(mid>start&&mid<end&&arr[mid]==arr[start]&&arr[start]==arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return arr[start];
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return arr[end - 1];
                }
                end--;
            }
             if(mid<end&&arr[mid]>arr[mid+1]){
                return arr[mid];
             }
             if(mid>start&&arr[mid]<arr[mid-1]&&arr[mid-1]>arr[mid+1]){
                 return arr[mid-1];
             }
             if(mid<end&&arr[mid]<arr[mid+1]||arr[start]==arr[mid]){
                 start=mid+1;
             }
             else if (mid>start&&arr[mid]>arr[mid+1]||arr[end]==arr[mid]){
                 end=mid;
             }
             else{
                 break;
             }
        }
        return arr[mid];
    }

//    not for duplicates
//    public static int findPivot(int []arr){
//        int start=0;
//        int end=arr.length-1;
//        int mid=0;
//        while (start<=end){
//             mid=start+(end-start)/2;
//             if(mid<end&&arr[mid]>arr[mid+1]){
//                return arr[mid];
//             }
//             if(mid<end&&arr[mid]<arr[mid+1]&&arr[mid-1]<arr[mid+1]){
//                 return arr[mid+1];
//             }
//             if(mid>start&&arr[mid]<arr[mid-1]&&arr[mid-1]>arr[mid+1]){
//                 return arr[mid-1];
//             }
//             if(arr[mid]>arr[start]){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//        }
//        return arr[mid];
//    }

}
