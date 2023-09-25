import java.util.Scanner;

public class matrixEqualOrNot {
    static void printmatrix(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int identical(int a[][],int b[][],int r,int c,int r1,int c1) {
        if (r != r1 || c != c1) {
            System.out.println("invalid output");
        }

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == b[i][j])
                    return 0;
                return 1;
            }
        }
        return 3;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row and column for first matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter the value for first matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter row and column for second matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int b[][]=new int[r1][c1];
        System.out.println("enter the value for first matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("the first matrix is");
        printmatrix(a);
        System.out.println("the second matrix is");
        printmatrix(b);
        if(identical(a,b,r,c,r1,c1)==0)
            System.out.println("the matrix are identical");
        else
            System.out.println("the matrix are not identical");
    }
}
