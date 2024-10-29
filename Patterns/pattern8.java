public class pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        int total_col = 0;
        int NoOfSpaces = 0;
        for (int i = 0; i <= n * 2; i++) {
            if (i <= n) {
                NoOfSpaces = n - (n - i);
            } else {
                NoOfSpaces = n - (i - n);
            }
            for (int j = 0; j < NoOfSpaces; j++) {
                System.out.print(" ");
            }
            if (i < n) {
                total_col = n - i;
            } else {
                total_col = i - n;
            }
            for (int j = 0; j <= total_col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
