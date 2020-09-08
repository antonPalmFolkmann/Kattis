package Difiiculty1;

import java.util.Scanner;

public class Heart_Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <n; i++) {
            int b = scanner.nextInt();
            double p = scanner.nextDouble();

            double APBM1 = 60*(b-1)/p;
            double APBMR = 60*b/p;
            double APBM2 = 60*(b+1)/p;

            System.out.println(APBM1 + " " + APBMR + " " + APBM2);
        }
    }
}
