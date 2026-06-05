import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSteps = 0;
        int highestSteps = 0;
        // Input steps for 7 days
        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter steps walked on Day " + day + ": ");
            int steps = sc.nextInt();
            totalSteps += steps;
            if (steps > highestSteps) {
                highestSteps = steps;
            }
        }
        double averageSteps = totalSteps / 7.0;
        // Display results
        System.out.println("\n--- Fitness Challenge Report ---");
        System.out.println("Total Steps: " + totalSteps);
        System.out.println("Average Steps: " + averageSteps);
        System.out.println("Highest Steps in a Day: " + highestSteps);
        sc.close();
    }
}