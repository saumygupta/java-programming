import java.util.Scanner;

public class productOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int pro=1;
        int n = sc.nextInt();
        while(n>0){
            int r=n%10;
            pro=pro*r;
            n=n/10;
        }
        System.out.println(pro);

    }
}

