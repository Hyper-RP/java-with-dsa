package basic;

public class main52 {
    public static void main(String[] args) {
        int num = 121;
        marks(num);
    }

    static boolean marks(int x) {
        int temp = x;
        int modulo = x;
        int res = 0;
        for (int i = 0; 0 < modulo||0>modulo; i++) {
            temp = modulo % 10;
            res = res * 10 + temp;
            modulo = modulo / 10;
            if (res==x){
                return true;
            }
            else{
                return false;
            }
        }
        return (res==x);
    }

}