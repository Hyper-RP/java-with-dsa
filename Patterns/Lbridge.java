public class Lbridge {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        int total_col=0;
        for (int i = 1; i <=n*2; i++) {
            if(i>n) {
                total_col = n - (i - n);
            }
            else {
                total_col = i;
            }
            for (int j = 1; j <= total_col; j++) {
                System.out.print("& ");
            }
            System.out.println();
        }

    }
}
