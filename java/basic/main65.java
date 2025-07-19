package basic;

import java.util.Scanner;

public class main65 {
    static int totalBalance=0;
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        int n=1;
        for (int i = 0; i < n; i++) {
            System.out.println("------------Welcome Lena Dena Bank----------------");
            System.out.println("--------------------------------------------------");
            System.out.println("1.Deposit ");
            System.out.println("2.Withdraw ");
            System.out.println("3.Check Balance ");
            System.out.println("4.Exit ");
            int num=sc.nextInt();
            switch (num){
                case 1:deposit();
                        i--;
                        break;
                case 2:withdraw();
                        i--;
                        break;
                case 3:checkBalnce();
                        i--;
                        break;
                case 4:i++;
            }
        }
        System.out.println("Thank you... Visit again");

    }

    public static void deposit(){
        Scanner sc =new Scanner(System.in);
        System.out.println("deposit amount in Rs : ");
        int moneyDeposit=sc.nextInt();
        totalBalance=totalBalance+moneyDeposit;
        System.out.println(moneyDeposit+"rs depositted in your account");

    }

    public static void withdraw(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Withdraw amount : ");
        int moneyWithdraw=sc.nextInt();

        totalBalance=totalBalance-moneyWithdraw;
        System.out.println("Successfully withdraw "+moneyWithdraw+"rs");
    }

    public static void checkBalnce(){
        System.out.println("Total balance : "+totalBalance+"rs");
    }

}
