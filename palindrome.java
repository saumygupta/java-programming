import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp;
        int n=sc.nextInt();
        temp=n;
        int rem=0;
        int sum=0;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
