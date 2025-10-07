
import java.util.Scanner;


public class Scanprogram {
    public static void main(String[] args) {

        //Read And Display Name

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your name:");
        String name=sc.nextLine();
        System.out.println("Hello"+" "+name);


        //Read two integers and display their sum

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of number1:");
        int num1=sc.nextInt();
        System.out.print("Enter the value of number2:");
        int num2=sc.nextInt();
        System.out.println("The sum of two numbers is:"+(num1+num2));

        //Read and Display a Float Number

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1:");
        float num1=sc.nextFloat();
        System.out.print("Enter the number2:");
        float num2=sc.nextFloat();
        System.out.println("The multiplication of number1 and number2 is:"+(num1*num2));

        //Read an integer and Even or odd

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num1=sc.nextInt();
        System.out.println("The given number is:"+((num1%2==0)? "Even":"Odd"));

        //Read two numbers and find the largest

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1=sc.nextInt();
        System.out.println("Enter the number2:");
        int num2=sc.nextInt();
        System.out.println("The largest number is:"+((num1>num2)? num1:num2));

        //Read Radius and Calculate Area of Circle

        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Area of Circle");
        System.out.println("Enter the radius:");
        int radius=sc.nextInt();
        System.out.println("The area of circle is:"+(pi*radius*radius));

        //Read Age and Check Eligibility to vote

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age=sc.nextInt();
        System.out.println((age>=18)?"You are Voter Eligibility":"You are not Eligibility for vote");

        //Read student details (Name,Roll, Marks)

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String Name=sc.nextLine();
        System.out.println("Enter the roll number:");
        int Rollno=sc.nextInt();
        System.out.println("Enter the Marks:");
        int marks=sc.nextInt();
        System.out.println("The name of Student is"+" "+Name);
        System.out.println("The roll number of Student is"+" "+Rollno);
        System.out.println("The marks of Student is"+" "+marks);
        
    }
    
}
