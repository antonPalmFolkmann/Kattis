package Difiiculty1;

import java.util.Scanner;

public class Last_Factorial_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int fact = scanner.nextInt();
            int factorial = factorial(fact);
            int result = factorial % 10;
            System.out.println(result);
        }

    }

    public static int factorial(int number) {
        int result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
