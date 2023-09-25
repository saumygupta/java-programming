import java.util.Scanner;

public class ArrayevenOddElementIntwoDifferenArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of an first array");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the value of an first array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("printed  first array is");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        int evensize=0;
        int oddsize=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                evensize++;
            }
            else{
                oddsize++;
            }
        }
        int even[]=new int[evensize];
        int odd[]=new int [oddsize];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even[e++]=a[i];
            }
            else{
                odd[o++]=a[i];
            }
        }
        System.out.println("the even elements are");
        System.out.println(even);
        System.out.println("the odd elements are");
        System.out.println(odd);
    }
}
