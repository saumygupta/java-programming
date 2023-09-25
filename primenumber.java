import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int n= sc.nextInt();
        int flag=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                flag++;
            }
        }
        if(flag==1){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
    }
}
