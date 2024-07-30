package basic;

import java.util.Scanner;

//calculate permutation and combination
public class main27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter total no.of objects : ");
        int n=input.nextInt();
        System.out.println("how many objects get selected : ");
        int r=input.nextInt();
        int fact=n;
        int fact3=r;
        int upon=n-r;
        int minus=upon;
        int fact2=upon;
        for (int i = 1; i < n; i++) {
            n=n-1;
            fact=fact*n;

            for (int j = 1; j < r; j++) {
                r=r-1;
                fact3=fact3*r;
            }

            for (int j = 1; j < minus; j++) {
                minus=minus-1;
                fact2=fact2*minus;
            }
        }
        int permutation=(fact/(fact2));
        int combination=(int)(fact/(fact3*(fact2)));
        System.out.println("factorial is : "+fact);
        System.out.println("upon factorial is : "+fact2);
        System.out.println("the permutation is (nPr) : "+permutation);
        System.out.println("the combination is (nCr) : "+combination);
    }
}
