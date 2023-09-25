import java .util.*;
public class mulofdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1;
        while(n>0){
            int rem=n%10;
            mul=mul*rem;
            n=n/10;
        }
        System.out.println(mul);
    }
}
