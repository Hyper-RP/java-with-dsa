package basic;
//to calculate electricity bill
// 100 units = 7rs per unit
// 200 units = 7.20rs per unit
// 300 units = 7.50rs per unit
import java.util.Scanner;

public class main16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of units : ");
        int units=in.nextInt();
        double res;

        if(units<=100){
            res=units*7;
            System.out.println("your electricity bill is : "+res);
        }
        if (units>100 && units<=300) {
            res=(100*7)+(units-100)*7.20;
            System.out.println("your electricity bill is : "+res);
        }
        if (units>300) {
            res=(100*7)+(200*7.20)+(units-300)*7.50;
            System.out.println("your electricity bill is : "+res);
        }

    }
}
