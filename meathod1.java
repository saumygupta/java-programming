import java .util.*;
class area{
    public double  area_of_circle(double r){
        return (3.14*r*r);
    }
    public int area_of_rectangle(int a,int b){
        return (a*b);
    }


}

public class method {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double n=sc.nextDouble();
        int a=sc.nextInt();
        int b=sc.nextInt();
        area obj=new area();
        System.out.println(obj.area_of_circle(n));
        System.out.println(obj.area_of_rectangle(a,b));
    }
}
