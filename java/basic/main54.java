package basic;
//Write a function that returns all prime numbers between two given numbers.
public class main54 {
    public static void main(String[] args) {
        int n=2;
        int res=1;
        int temp=n;
        for (int i = temp; i > 2;) {
            i--;
            temp = n % i;
            res=res*temp;

        }System.out.println(res);
        System.out.println(temp);
    }

}
