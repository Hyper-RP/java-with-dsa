package basic;

public class first {
    public static void main(String[]args){
        int[]arry2={4,9,5};
        int[]arry={9,4,9,8,4};
        for (int i = 0; i <arry.length; i++) {
            for (int j = 0; j < arry2.length; j++) {
                if (arry[i]==arry2[j]) {
                    System.out.println(arry[i]);
                    break;
                }
            }

        }
    }
}
