package Difiiculty1;

import java.util.Scanner;

public class Number_Fun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a+b == c || a*b == c || a-b == c || b-a == c || a*1.0/b == c || b*1.0/a == c){
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
