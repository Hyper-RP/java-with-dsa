package basic;
//printing fibonacci series
public class main69 {
    public static void main(String[] args) {
        int num=15;
        System.out.print(0+" "+1);
        fibonacci(num);
    }

    public static void fibonacci(int num){
        int first=0;
        int second=1;
        int third;
        for (int i = 0; i <=num ; i++) {
            third=first+second;
            first=second;
            second=third;
            System.out.print(" "+third+" ");
        }
    }

}
