package graph;

import java.util.Scanner;

public class graph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of vertices : ");
        int n=sc.nextInt();
        System.out.println("edges : ");
        int e=sc.nextInt();
        solve(n,e);
    }

    public static void solve(int n,int e){
        Scanner sc1=new Scanner(System.in);
        int v1;
        int v2;
        int[][] arr=new int[n][n];
        for (int i = 0; i < e; i++) {
            v1=sc1.nextInt();
            v2=sc1.nextInt();
            arr[v1][v2]=1;
            arr[v2][v1]=1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
