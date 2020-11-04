package Difiiculty1;

import java.util.Scanner;

public class Roaming_Romans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nMiles = scanner.nextDouble();
        double romanFactor = 1000*5280.0/4854;
        double romanPaces = nMiles*romanFactor;
        System.out.println(Math.round(romanPaces));
    }
}
