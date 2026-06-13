
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        int originalNum = num; // Stored to print at the end
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        System.out.println("The sum of digits of " + originalNum + " is: " + sum);
        
        scanner.close();
    }
}