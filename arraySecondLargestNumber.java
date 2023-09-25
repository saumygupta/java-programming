import java.util.Scanner;
import java.util.Arrays;
public class arraySecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        Arrays.sort(a);
        System.out.println(a[n-2]);
    }
}
