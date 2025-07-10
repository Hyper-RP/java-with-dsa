package basic;

public class main62 {
    public static void main(String[] args) {
        String name="Rohit";
        String ans=res(name);
        System.out.println(ans);
    }

    static String res(String name){
        String ans="";
        for (int i = 0; i < name.length(); i++) {
           ans=ans+name.charAt(name.length()-(i+1));
        }
        return ans;
    }
}
