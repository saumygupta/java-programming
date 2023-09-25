import java.util.Scanner;

public class matrixAdd {
     static void printmatrix(int matrix[][]){
        for(int i=0;i< matrix.length;i++)
         {
             for(int j=0;j<matrix[i].length;j++){
                 System.out.print(matrix[i][j]+ " ");
             }
             System.out.println();
         }
    }
    static void add(int a[][],int r,int c, int b[][],int r1, int c1){
         if(r1!=r || c1!=c){
             System.out.println("wrong input for addition");
             return;
         }
         int sum[][]=new int[r][c];
         for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                  sum[i][j]=a[i][j]+b[i][j];
             }
         }
         printmatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns for first matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("enter matrix value");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter number of rows and columns for second matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int b[][] = new int[r1][c1];
        System.out.println("enter matrix value");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matrix");
        printmatrix(a);
        System.out.println("second matrix");
        printmatrix(b);
        System.out.println("the addition of two matrix");
        add(a,r,c,b,r1,c1);

            }
        }




