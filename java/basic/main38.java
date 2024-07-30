package basic;

import java.util.Scanner;
 //normal and enhanced switch statement
public class main38 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a fruit : ");
        String fruit=input.next();
//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("sweet red fruit");
//                break;
//            default:
//                System.out.println("enter a valid fruit");
//        }
        String city=input.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple": {
                System.out.println("sweet red fruit");
                switch (city) {
                    case "nashik":
                        System.out.println("grapes");
                        break;
                    case "jalgaon":
                        System.out.println("banana");
                        break;
                    default:
                        System.out.println("enter a valid city");
                        break;
                }break;

            }
            default:
                System.out.println("enter a valid fruit");
                break;
        }
    }
}
