import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current age: ");
        int age = sc.nextInt();
        System.out.println("\n--- AI Age Predictor ---");
        System.out.println("Your age after 10 years: " + (age + 10));
        System.out.println("Your age after 25 years: " + (age + 25));
        System.out.println("Your age after 50 years: " + (age + 50));
        // Bonus: Predict year when user turns 100
        int currentYear = 2026;
        int yearTurn100 = currentYear + (100 - age);
        System.out.println("You will turn 100 in the year: " + yearTurn100);
        sc.close();
    }
}