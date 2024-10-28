public class leftPyramid {
    public static void main(String[] args) {
        leftPyramid(4);
    }
    public static void leftPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
