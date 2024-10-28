public class pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int n){

        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= n; j++) {

                if (n - i <= j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
