package Difiiculty1;

import java.util.Scanner;

public class Shattered_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeWidth = scanner.nextInt();
        int nPieces = scanner.nextInt();
        int cakeArea = 0;
        for (int i = 0; i < nPieces; i++) {
            int pieceWidth = scanner.nextInt();
            int pieceLength = scanner.nextInt();
            cakeArea += pieceLength*pieceWidth;
        }
        int cakeLength = cakeArea/cakeWidth;
        System.out.println(cakeLength);
    }
}
