import java.util.Scanner;

public class ArrayDeletePositionAtSpecifiedInbex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int size=a.length;
        System.out.println("enter the value of an array");
        for(int i=0;i<size;i++){
             a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("enter the position to be deleted ");
        int p=sc.nextInt();
        for(int i=p;i<size-1;i++){
            a[i]=a[i+1];

            size--;
        }
        for(int i=0;i<size;i++){
            System.out.println(a[i]+" ");
        }
    }
}
