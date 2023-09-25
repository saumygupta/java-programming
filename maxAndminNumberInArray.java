import java.util.Scanner;

public class maxAndminNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int min=Integer.MIN_VALUE;
        int max=0;

        int arr[] = new int[n];
        System.out.println("enter the number in array");

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element is "+max);
        System.out.println("minimun element is "+min);
        }
    }
