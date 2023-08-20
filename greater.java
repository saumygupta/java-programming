public class greater {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int c = 25;
      /*  if (a > b && a > c) {
            System.out.println("a is graeter = " + a);
        } else if (b > a && b > c) {
            System.out.println("b is greater = " + b);
        } else {
            System.out.println("c is greater = " + c);
        }*/
        int t=a>b && a>c? a:b>a && b>c?b:c;
        System.out.println("greater number is = " + t);
    }
}
