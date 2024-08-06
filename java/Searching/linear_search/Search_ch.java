package Searching.linear_search;
//search character in a string and if it is found return the index of character, otherwise return -1
public class Search_ch {
    public static void main(String[] args) {
        int res =ischeck("Rohit");
        System.out.println(res);
    }

    static int ischeck(String name){
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='t'){
                return i;
            }
        }
        return -1;
    }
}

