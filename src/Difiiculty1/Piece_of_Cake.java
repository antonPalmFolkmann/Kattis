package Difiiculty1;

import java.util.Scanner;

public class Piece_of_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int h = scanner.nextInt();
        if (length - h > h){
            h = length - h;
        }

        int v = scanner.nextInt();
        if (length - v > v) {
            v = length - v;
        }
        int volume = v*h*4;
        System.out.println(volume);
    }
}
