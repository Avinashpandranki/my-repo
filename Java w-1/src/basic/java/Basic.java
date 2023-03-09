package basic.java;
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int age;
        double height;
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
         age = sc.nextInt();
         height =sc.nextFloat();
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Height:"+height);

    }
}
