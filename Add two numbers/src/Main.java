import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 value: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 value: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Addition of two numbers: " + sum);
    }
}
