import java.util.Scanner;

public class arrayNumberPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("enter the value of an array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("printed array is");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("the number to be found is");
        int num= sc.nextInt();
        int found=0;
        for(int i=0;i<n;i++){
        if(num==a[i]){
            found++;
            break;
        }
        }
        if(found==1){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
    }
}
