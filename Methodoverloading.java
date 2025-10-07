import java.util.Scanner;
public class Methodoverloading {
    //Method overloading by changing number of Parameters

    static void add(int a,int b)
    {
        System.out.println("the sum of a and b is"+" "+(a+b));
    }
    static void add(int a,int b,int c)
{
    System.out.println("the sum of a and b and c is"+" "+(a+b+c));

}  
    //Area of Calculation
    static void square(int s)
    {
        System.out.println("The square of Area:"+(s*s));
    }
    static void circle(double r)
    {
        System.out.println("The area of circle:"+(3.14*r*r));
    }
    static void Rectangle(int l,int b)
    {
        System.out.println("The rectangle of area:"+(l*b));
    }
public static void main(String[] args) {
    
    add(10,20);
    add(10,20,30);
    square(5);
    circle(5);
    Rectangle(10, 20);
}

}
