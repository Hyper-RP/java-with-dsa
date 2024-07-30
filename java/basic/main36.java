package basic;
//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
public class main36 {
    public static void main(String[] args) {
        String name="kunal";
        int go=0;
        for (int i = 1; i < 31; i++) {
            if(i%2==0){
                System.out.print(i+",");
                go++;
            }

        }
        System.out.println();
        System.out.println("total days for outing somewhere : "+go);
    }
}
