package Difiiculty1;

import java.util.Scanner;

public class Chanukah_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int dSet = scanner.nextInt();
            int nDays = scanner.nextInt();
            int nCand = 0;
            for (int j = 1; j <= nDays; j++){
                nCand = nCand + 1 + j;
            }
            System.out.println(dSet + " " + nCand);
        }
    }
}
