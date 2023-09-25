import java.util.Scanner;

public class matrix {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int [][]mat=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                mat[i][j]= sc.nextInt();

            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
