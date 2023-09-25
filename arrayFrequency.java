import java.util.Scanner;

public class arrayFrequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int count=0;
        System.out.println("enter the number to be search");
        int num=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==num){
                count++;
            }
        }
        System.out.println("the number of time an element occur ");
        System.out.println(count);
    }
}
