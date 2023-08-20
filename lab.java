import javax.xml.namespace.QName;
import java .util.*;
class student1{
    String name;
    int roll_no;
    long phonenum;
    float m1;
    float m2;
    float m3;
    double result;

    void get(){
        Scanner sc= new Scanner (System.in);
        name= sc.nextLine();
        roll_no= sc.nextInt();
        phonenum=sc.nextLong();
        m1=sc.nextFloat();
        m2= sc.nextFloat();
        m3=sc.nextFloat();

    }
    void display(){
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(phonenum);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
    void result(){
        result=(m1+m2+m3)/300*100;
        System.out.println(result);
    }





}


public class lab {
    public static void main(String[] args) {
        student1 obj= new student1();
         obj.get();
         obj.display();
        obj.result();
        student1 obj2= new student1();
        obj2.get();
        obj2.display();
        obj.result();

    }
}
