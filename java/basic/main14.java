package basic;

public class main14 {
    public static void main(String[] args) {
        int n=5;
        int temp=n;
        int key=0;
        int res=1;
        while (n>0){

            res=res*temp;
            temp=temp-1;
        }
        System.out.println(res);
    }
}
