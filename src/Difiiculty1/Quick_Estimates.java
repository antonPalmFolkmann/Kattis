package Difiiculty1;

import java.util.Scanner;

public class Quick_Estimates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String number = scanner.next();
            int length = number.length();
            System.out.println(length);
        }
    }
}
