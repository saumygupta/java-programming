import java.util.Scanner;

public class transposeMatrix {
    static void printmatrix(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
     static int [][]transpose(int a[][],int c,int r){
         int ans[][] = new int[c][r];
         for(int i=0;i<c;i++){
             for(int j=0;j<r;j++){
                 ans[i][j]=a[j][i];
             }
         }
         return ans;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row and column for first matrix");
        int r=sc.nextInt();
        int c= sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter the value of  first matrix ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("the first matrix is");
        printmatrix(a);
        System.out.println("the transpose of first matrix is");

        int ans[][]=transpose(a,r,c);
        printmatrix(ans);
    }
}
