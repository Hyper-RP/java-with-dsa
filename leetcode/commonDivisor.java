
//1071. Greatest Common Divisor of Strings
public class commonDivisor {
    public static void main(String[] args) {
    String str1="ABCDEF";
    String str2="ABC";
    String res=solve(str1,str2);
        System.out.println(res);
    }

    public static String solve(String str1,String str2){
        int ptr1=0;
        int ptr2=0;
        String ans="";
        while(ptr1<str1.length()){
            char ch1=str1.charAt(ptr1);
            char ch2=str2.charAt(ptr2);
            if(ptr2==str2.length()-1){
                ptr1++;
                ptr2=0;
            }
            if(ch1==ch2){
                if(!ans.contains(""+ch2)){
                    ans=ans+ch2;
                }
                ptr1++;
                ptr2++;
            }
            else{
                return "";
            }



        }

        // if(str1.contains(str2)){
        return ans;
        // }
        // return "";


    }
}
