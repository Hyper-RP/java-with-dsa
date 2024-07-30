package basic;

public class main51 {
    public static void main(String[] args) {
        int n=123;
        int modulo = n;
        int temp = 0;
        long rem = 0;
        double min = Math.pow(-2, 31);
        double max = Math.pow(2, 31);
        for (int i = 0; 0 < modulo || 0 > modulo; i++) {
            temp = modulo % 10;
            rem = (rem * 10) + temp;
            modulo = modulo / 10;
        }
        System.out.println(rem);
        if (rem > max||rem<min) {
            rem=0;
            System.out.println(rem);
        }
    }
}
