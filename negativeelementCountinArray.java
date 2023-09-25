import java.util.Scanner;

public class negativeelementCountinArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n= sc.nextInt();
        int count=0;
        int a[]=new int[n];
        System.out.println("enter the value of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]<0){
                count++;
            }
        }



        System.out.println("the neative value in an array are " +count );
    }
}
