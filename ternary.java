public class ternary {
    public static void main(String[]args)  
    {
        //largest two values using ternary operators

        // int num1=100;
        // int num2=30;

        // String greater=(num1>=num2) ? "The num1 is greater number" : "The num2 is greater number";
        // System.out.println(greater);



        //largest three values using ternary operators

        // int a=20;
        // int b=30;
        // int c=50;

        // String number=((a>b)&&(a>c)) ? "a Biggest" : ((b>a)&&(b>c)) ? "b Biggest" :"c Biggest";
        // System.out.println(number);

        //Grade system using ternary operator

        int mark=30;

        String student=(mark>=90) ? "A Grade" : ((mark>=70)&&(mark<=89)) ? "B Grade" : ((mark>=35)&&(mark<=69)) ? "C Grade" : "D Grade";
        System.out.println(student);

        
    } 
}
