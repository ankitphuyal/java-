import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is Not a Palindrome Number.");
        }
        sc.close();
    }
}