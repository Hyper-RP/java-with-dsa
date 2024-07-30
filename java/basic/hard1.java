package basic;
//Define a method to find out if a number is prime or not.
//hard problem.
public class hard1 {
    public static void main(String[] args) {
        int num=11;
        int last=1000;
         isprime(num,last);
    }
    static void isprime(int n,int l){
        int temp=n;
        int set=n;
        int end=l;
        int digit=0;
        int ndigits=0;
        double res=1;
        while (set<end) {
            for (int i = temp; i > 2;) {
                i--;
                temp = n % i;
                if(temp!=0){
                    temp=1;
                }
                res=(res*temp);
            }
            if (res == 0) {
//                System.out.println("not prime number " + n);
                ndigits++;
            } else {
                System.out.println("prime number " + n);
                digit++;
            }
            set+=1;
            temp=n;
            temp+=1;
            n+=1;
            res=1;
        }
        System.out.println(digit+" prime number");
        System.out.println(ndigits+" not prime number");
    }

}
