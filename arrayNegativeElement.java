import java.util.Scanner;

public class arrayNegativeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the number in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]<0)
            System.out.println(arr[i]);
        }
    }
}
