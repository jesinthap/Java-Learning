import java.util.Scanner;

public class Methods {

    static void add(int a,int b)
    {
        System.out.println("the sum of two values is:"+(a+b));
    }
    static void sub(int a,int b)
    {
        System.out.println("the sub of two values is:"+(a-b));
    }
    static void mul(int a,int b)
    {
        System.out.println("the Multiple of two values is:"+(a*b));
    }
    static void div(int a,int b)
    {
        System.out.println("the Division of two values is:"+(a/b));
    }
    static void mod(int a,int b)
    {
        System.out.println("the Modules of two values is:"+(a%b));
    }
    public static void main(String[] args) {
        add(10,20);
        sub(20,10);
        mul(10,10);
        div(20,10);
        mod(30,20);
    }
    
}
