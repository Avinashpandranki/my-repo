package basic.java;
import java.util.Scanner;
public class conditionalstatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0) {
            System.out.println("Number is -ve");
                 }
        else {
            System.out.println("Number is +ve");
            }
        System.out.println("End of program-");
    }
}
