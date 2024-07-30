package basic;
//check maximum and minimum with two function.
import java.util.Scanner;

public class main41 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter num 1 : ");
        int num1=input.nextInt();
        System.out.println("enter num 2 : ");
        int num2=input.nextInt();
        System.out.println("enter num 3 : ");
        int num3=input.nextInt();
        int max=isMax(num1,num2,num3);
        System.out.println("the maximum is : "+max);
        int min=isMin(num1,num2,num3);
        System.out.println("the minimum is : "+min);

        }
        static int isMax(int n1,int n2,int n3){
        int max=0;
        if(max<n1)
            max=n1;
        if (max<n2)
            max=n2;
        if(max<n3)
            max=n3;
        return max;

    }
        static int isMin(int n1,int n2,int n3){
            int min=9999;
            if(min>n1)
                min=n1;
            if (min>n2)
                min=n2;
            if(min>n3)
                min=n3;
            return min;
        }
}
