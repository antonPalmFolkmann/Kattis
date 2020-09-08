package Difiiculty1;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int I = scanner.nextInt();

        int minBribe = (int) Math.ceil(A*(I-1)+1);
        System.out.println(minBribe);
    }
}
