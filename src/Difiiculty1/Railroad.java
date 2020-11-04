package Difiiculty1;

import java.util.Scanner;

public class Railroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        if (Y % 2 == 0){
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }
    }
}
