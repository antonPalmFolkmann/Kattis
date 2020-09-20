package Difiiculty1;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int mbAvail = x;
        for (int i = 0; i < n; i++){
            int usage = scanner.nextInt();
            mbAvail = mbAvail + (x - usage);
        }
        System.out.println(mbAvail);
    }
}
