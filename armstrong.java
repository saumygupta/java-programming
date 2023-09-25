import java.util.*;

public class armstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int q=n;
        double h=0;


        int c=0;
        while(n>0){
            c=c+1;
            n=n/10;
        }
        while(temp>0){
            int rem=temp%10;
            h= h + Math.pow(rem,c);
            temp=temp/10;
        }
        if(h==q){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
