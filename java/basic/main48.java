package basic;

import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
//
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
public class main48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num  : ");
        int marks=input.nextInt();
        isgrade(marks);

    }
    static void isgrade(int mark){
        if (mark <= 40) {
            System.out.println("fail");
        } else if (mark<=51) {
            System.out.println("DD");
        } else if (mark<=61) {
            System.out.println("CD");
        } else if (mark<=71) {
            System.out.println("BC");
        } else if (mark<=81) {
            System.out.println("BB");
        } else if (mark<=91) {
            System.out.println("AB");
        } else if (mark<=100) {
            System.out.println("AA");
        } else {
            System.out.println("Fail");
        }
    }
}
