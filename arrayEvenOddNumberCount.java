import java.util.Scanner;

public class arrayEvenOddNumberCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int e=0;
        int o=0;
        int a[]=new int[n];
        System.out.println("enter the element in an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i:a){
            if(i%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        System.out.println("the total number of even element is "+e);
        System.out.println("the total number of odd element is "+o);

    }
}
