import java.util.*;
public class searcharray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.println("x found at index"  +  i);
            }
        }
    }
}
