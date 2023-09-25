import java.util.Scanner;

public class saclarMatrixMultiplication {
    static void printmatrix(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiply(int a[][],int k,int r, int c){
        for (int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = a[i][j] * k;
            }
        }
        printmatrix(a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row and column");
        int r= sc.nextInt();
        int c= sc.nextInt();

        int a[][]=new int[r][c];
        System.out.println("enter element in matrix");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is");
        printmatrix(a);
        System.out.println("enter the element to be multiply");
        int k= sc.nextInt();
        System.out.println("the scalar matrix is");
        multiply(a,k,r,c);


    }
}
