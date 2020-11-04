package Difiiculty1;

import java.util.Scanner;

public class Reversed_Binary_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String binaryRepresentation = Integer.toBinaryString(num);
        String finalString = new StringBuilder(binaryRepresentation).reverse().toString();
        int finalInteger = Integer.parseInt(finalString,2);
        System.out.println(finalInteger);
    }
}
