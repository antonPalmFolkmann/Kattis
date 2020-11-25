package Difiiculty1;

import java.util.Scanner;

public class Job_Expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int expenses = 0;
        for (int i = 0; i < n; i++) {
            int exp = scanner.nextInt();
            if (exp < 0) expenses += exp;
        }
        System.out.println(expenses*(-1));
    }
}
