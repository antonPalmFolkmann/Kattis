package Difiiculty1;

import java.util.Scanner;

public class Electrical_Outlets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCases = scanner.nextInt();
        for (int i = 0; i < nCases; i++) {
            int nOutlets = 1;
            int nStrips = scanner.nextInt();
            for (int j = 0; j < nStrips; j++) {
                nOutlets += scanner.nextInt() - 1;
            }
            System.out.println(nOutlets);
        }
    }
}
