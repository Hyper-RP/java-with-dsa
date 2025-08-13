//package java;
//151. Reverse Words in a String

public class reverseWords {
    public static void main(String[] args) {
        String name="my name is rohit";
        String ans=solve(name);
        System.out.println("final string : "+ans);
    }
    public static String solve(String str){
        String[] strArr=str.split(" ");
        StringBuilder ans=new StringBuilder();
        int len=strArr.length;
        for(int i=0;i<len;i++){
            if(strArr[len-(i+1)].equals("")){
                continue;
            }
            else{
                ans.append(strArr[len-(i+1)]+" ");
            }
        }
        return ans.toString().trim();
    }
}
