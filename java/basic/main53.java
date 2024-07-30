package basic;

public class main53 {
    public static void main(String[] args) {
        String s="MCMXCIV";
        int num=0;
        int res=0;
        int len=s.length()-1;
        for (int i = 0; -1 <len ; i++) {
            switch(s.charAt(len)) {
                case 'I': num = 1;
                    break;
                case 'V': num = 5;
                    break;
                case 'X': num = 10;
                    break;
                case 'L': num = 50;
                    break;
                case 'C': num = 100;
                    break;
                case 'D': num = 500;
                    break;
                case 'M': num = 1000;
                    break;
            }
            if ( num < res)
                res -= num;
            else
                res += num;
            len=len-1;
        }
        }
    }

