public class pattern7 {
    public static void main(String[] args) {
        pattern(15);
    }

    private static void pattern(int n) {
        int total_col=0;
        for (int i = 1; i <= n*2; i++) {
            //to print column 1 to n
            if(i<=n) {
                total_col = n;
            }
            //to print column n-1 to
            else{
                total_col=n-(i - n);
            }
            //to prin spaces
            int noOfSpace=0;
            // print spces form n-1 to 1
            if (i<n) {
               noOfSpace =n-i;
            }
            //print spaces from 1 to n-1
            else{
                noOfSpace=i-n;
            }
            for (int k = 0; k < noOfSpace; k++) {
                System.out.print(" ");
            }
            //to print star
            for (int j = 1; j <=total_col; j++) {
                if(n-i<j) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
