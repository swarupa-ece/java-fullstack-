
import java.util.Scanner;

public class OddHollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}