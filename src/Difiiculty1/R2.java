package Difiiculty1;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        int R1;
        int R2;
        int S1;
        Scanner scanner = new Scanner(System.in);

        R1 = scanner.nextInt();
        S1 = scanner.nextInt();

        R2 = S1*2 - R1;
        System.out.println(R2);
    }
}
