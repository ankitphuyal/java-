import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        boolean result = (num1 + num2 == num3);
        if (result) {
            System.out.println("The third number is the sum of the first two numbers.");
        } else {
            System.out.println("The third number is NOT the sum of the first two numbers.");
        }
        sc.close();
    }
}