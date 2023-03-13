package basic.java;
import java.lang.module.ModuleDescriptor;
import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println("Sum: "+sumOfTwoNumbers(a,b));
        System.out.println("Num1:" );
        OddEven(a);
        System.out.println("Num2; ");
        OddEven(b);

    }
       public static int sumOfTwoNumbers(int num1, int num2)
       {
           int sum =num1+num2;
                   return sum;

    }
    public static int OddEven(int num)
    {
        if (num%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    return num;}

}
