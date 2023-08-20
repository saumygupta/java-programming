import java.util.Scanner;
public class metod2 {
    static int fact(int n){
        int fac=1;
        for(int i = 1; i <= n; i++) {
            fac *= i;
        }

        return(fac);
    }
    static int greatest(int a,int b,int c){
        int t = a > b && a > c ? a : (b > a && b > c ? b : c);
        return(t);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(fact(n));
        System.out.println(greatest(a,b,c));
    }
}
