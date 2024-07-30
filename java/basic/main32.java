package basic;
//calculate appreciation value
public class main32 {
    public static void main(String[] args) {
        int p=100;
        int r=10;
        int n=2;
        int res=(int)(p*Math.pow((1+0.01*r),n));
        System.out.println(res+" is a apreciation value after "+n+" years at "+r+" % increment per year");
    }
}
