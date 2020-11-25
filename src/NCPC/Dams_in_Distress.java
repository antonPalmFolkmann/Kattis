package NCPC;

import java.util.Scanner;

public class Dams_in_Distress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nDams = scanner.nextInt();
        int amountWater = scanner.nextInt();
        int[] damNumber = new int[nDams];
        int[] damCapacity = new int[nDams];
        int[] damWater = new int[nDams];
        for (int i = 0; i < nDams; i++) {
            damNumber[i] = scanner.nextInt();
            damCapacity[i] = scanner.nextInt();
            damWater[i] = scanner.nextInt();
        }


    }
}
