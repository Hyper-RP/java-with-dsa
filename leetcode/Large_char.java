//leetcode 744
public class Large_char {
    public static void main(String[] args) {
        char arr[]={'c','f','j'};
        char target='z';
        char res=isLarge(arr,target);
        System.out.println(res);
    }

     static char isLarge(char[] arr, char target) {
        int start=0;
        int end= arr.length-1;
        int mid=0;
        while (start<=end+1){
            mid=start+(end-start)/2;
              if (arr[arr.length-1]<=target) {
                return arr[0];
            }
            else if(arr[mid]<=target){
                start=mid+1;
            }
            else {
                end=end-1;
            }
        }
        return arr[start%arr.length];
    }
}
