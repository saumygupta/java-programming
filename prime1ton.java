import java.util.Scanner;

public class prime1ton {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<100;i++){
            int c=0;
            for(int j=i;j>=1;j--){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(i);

            }

        }

    }
}
