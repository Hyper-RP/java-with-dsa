package basic;

public class main28 {
    public static void main(String[] args) {
        int n=5;
        int fact=n;
        for (int i = 1; i <n ; i++) {
            n--;
            fact=fact*n;

        }
        System.out.println("the factorial is : "+fact);
    }
}
