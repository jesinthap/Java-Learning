


public class ControlStatement {
    public static void main(String arg[])
    {
        //Odd number or Even number
        int num1=5;
         if(num1%2==0)
        {
            System.out.println("The number is even number");
        }
        else
        {
            System.out.println("The number is odd number");
        }
    
        //Leap year or non Leap year

        int year=2028;

        if(year%4==0)
        {
            System.out.println("The given year is leap year");
        }
        else
        {
            System.out.println("The given year is not leap year");
        }

        //Learner and voter eligibility
        int age=10;

        if(age>=18)
        {
            System.out.println("You are eligible for learner and voter");
        }
        else
        {
            System.out.println("You are not eligible for learner and voter");
        }



        // Largest two numbers
        int number1=100;
        int number2=20;

        if (number1>number2) 
        {
            System.out.println("The Number1 is greater than Number2");
        } 
        else 
        {
            System.out.println("The Number2 is greater than Number1");
        }



        //Student pass or fail

        int mark=6;

        if(mark>35)
        {
            System.out.println("The student is pass");
        }
        else
        {
            System.out.println("The student is fail");
        }

        //The number is postive or negative

        int Num3=10;

        if(Num3>0)
        {
            System.out.println("The given number is positive");
        }
        else
        {
            System.out.println("The given number is negative");
        }

        // largest three numbers

        int mark1=400;
        int mark2=800;
        int mark3=120;
        
        if((mark1>mark2)&&(mark1>mark3))
        {
            System.out.println("The mark1 is greather than mark2 and mark3");
        }
        else if((mark2>mark1)&&(mark2>mark3))
        {
            System.out.println("The mark2 is greater than mark1 and mark3");
        }
        else{
             System.out.println("The mark3 is greater than mark1 and mark2");
        }

        //Student grade

        int student=95;

        if(student>35)
        {
            if(student>80)
            {
                System.out.println("A GRADE");
            }
            else if(student>60)
            {
                System.out.println("B GRADE");
            }
            else{
                System.out.println("C Grade");
            }
        }
        else
        {

            System.out.println("The student is fail");
        }


        //To display the day of the week based on number

        int date=5; 
        
    
        if(date==1)
        {
            System.out.println("sunday");
        }
        else if(date==2)
        {
            System.out.println("monday");
        }
        else if(date==3)
        {
            System.out.println("tuesday");
        }
         else if(date==4)
        {
            System.out.println("wednesday");
        }
         else if(date==5)
        {
            System.out.println("thursday");
        }
         else if(date==6)
        {
            System.out.println("friday");
        }
         else if(date==7)
        {
            System.out.println("saturday");
        }

        //discount

        int Total=3000;

        if((Total>=1000)||(Total<=2000))
        {
            System.out.println("The discount is="+((20*Total)/100));
        }
        else if((Total>=2000)||(Total<=3000))
        {
            System.out.println("the discount is="+((20*Total)/100));
        }
        else if((Total>=4000)||(Total<=5000))
        {   
            System.out.println("the discount is="+((20*Total)/100));
        }

        //username and password

        String name="Jesintha";
        String password="jesi_123";

        if(name.equals("Jesintha"))
        {
            if(password.equals("jesi_123"))
            {
                System.out.println("Welcome");
            }
            else{
                System.out.println("Retry");
            }
        }

    }


}


