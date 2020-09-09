package Difiiculty1;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.next();
        int place = 1;
        for (int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == 'A') {
                if (place == 1) {place=2;}
                else if (place == 2) {place=1;}
            } else if (moves.charAt(i) == 'B'){
                if (place == 2) {place=3;}
                else if (place == 3) {place=2;}
            } else if (moves.charAt(i) == 'C'){
                if (place == 1) {place=3;}
                else if (place == 3) {place=1;}
            }
        }
        System.out.println(place);

    }
}
