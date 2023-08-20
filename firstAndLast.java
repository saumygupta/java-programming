import java.util.*;
public class FirstLastDigit {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = n%10;
        System.out.println("Last digit: "+lastDigit);

        while(n!=0) {
            firstDigit = n%10;
            n /= 10;
        }
        System.out.println("First digit: "+firstDigit);
    }
}
