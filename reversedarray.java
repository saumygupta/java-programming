import java.util.Scanner;

public class reversedarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the value of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("printed array is");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
        System.out.println("the reversed array is");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }

    }
}
