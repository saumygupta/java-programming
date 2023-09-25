import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        System.out.println("enter the length of an array");
        int n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the value of an array");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        for(int i=0;i<n;i++) {
            System.out.printf("a[%d]=%d\n", i, a[i]);
        }
            System.out.println("the sum is" + sum);

    }
}
