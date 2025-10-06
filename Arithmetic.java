class Arithmetic
{
    public static void main(String[] args) {
        int num1=20;
        int num2=20;
        float num3=10.6f;
        byte num4=120;
        System.out.println("======Arithmetic-Operators====");
        System.out.println("Sum of num1 and num2:"+(num1+num2));
        System.out.println("Sub of num1 and num2:"+(num1-num2));
        System.out.println("Multiply of num1 and num2:"+(num1*num2));
        System.out.println("Division of num1 and num2:"+(num1/num2));
        System.out.println("Module of num1 and num2:"+(num1%num2));
        System.out.println("======Assignment-operators====");
        System.out.println("Sum of num3 and num4:"+(num3+=num4));
        System.out.println("Sub of num3 and num4:"+(num3+=num4));
        System.out.println("Multiply of num3 and num4:"+(num3+=num4));
        System.out.println("Division of num3 and num4:"+(num3+=num4));
        System.out.println("Module of num1 and num2:"+(num1%=num2));
    }
}
