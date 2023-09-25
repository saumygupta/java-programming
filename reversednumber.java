import java.util.Scanner;

public class reversednumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp;
        int n=sc.nextInt();
        temp=n;
        int rem=0;
        int sum=0;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
