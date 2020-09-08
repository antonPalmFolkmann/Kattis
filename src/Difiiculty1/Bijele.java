package Difiiculty1;

import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pieces = {1,1,2,2,2,8};
        int king = pieces[0] - scanner.nextInt();
        int queen = pieces[1] - scanner.nextInt();
        int rook = pieces[2] - scanner.nextInt();
        int bishop = pieces[3] - scanner.nextInt();
        int knight = pieces[4] - scanner.nextInt();
        int pawns = pieces[5] - scanner.nextInt();

        System.out.println(king + " " + queen + " " + rook + " " + bishop
        + " " + knight + " " + pawns);
    }
}
