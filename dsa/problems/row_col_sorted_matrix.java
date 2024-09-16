import java.util.Arrays;

//search an target element in a matrix which is sorted row wise and column wise.
public class row_col_sorted_matrix {
    public static void main(String[] args) {
        int [][]matrix={
                {10,20,30,40},
                {15,25,35,45},
                {17,27,37,47},
                {19,29,39,49}
        };
        int target=17;
        int []res=ischeck(matrix,target);
        System.out.println(Arrays.toString(res));
    }
    static int[]ischeck(int [][]matrix,int target){
        int row=0;
        int col=matrix.length-1;
        while(row< matrix.length&&col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }

}
