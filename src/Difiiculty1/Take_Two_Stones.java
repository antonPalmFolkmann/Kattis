package Difiiculty1;

import java.util.Scanner;

public class Take_Two_Stones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0){
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
