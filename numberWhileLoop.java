import java.util.Scanner;

public class numberWhileLoop {
    public static void main(String[] args) {
        int i=1;
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
}
