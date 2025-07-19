package basic;
//swap number without using third variable

public class main66 {
    public static void main(String[] args) {
        int first=5;
        int second=10;

//        first=first+second;
//        second=first-second;
//        first=first-second;

        first=first^second;
        second=first^second;
        first=first^second;

        System.out.println("first : "+first+" second : "+second);
    }
}
