
import java.util.*;
                public class pattern1 {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        int m = sc.nextInt();//for rows
                        int n = sc.nextInt();//for columns
                        for (int i = 1; i <= m; i++) {
                            for (int j = 1; j <= n; j++) {
                                System.out.print("*");
                            }

                            System.out.println();
                        }
                    }
    }

