import java.util.Scanner;

public class Recursive {
    static void factorial(int a)
    {
       int fact=1;
        for(int i=5;i>=1;i--)
        {
            fact=fact*i;

             }
             System.out.println("the factorial is"+" "+fact);
    }
    public static void main(String[] args) {
        factorial(5);
    }
    
}
