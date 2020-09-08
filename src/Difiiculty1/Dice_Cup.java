package Difiiculty1;

import java.util.Scanner;

public class Dice_Cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int diff = Math.abs(dice1-dice2);
        if (diff == 0){
            System.out.println(dice1 + 1);
        } else {
            for (int i = 0; i <= diff; i++){
                System.out.println(Math.min(dice1,dice2) + 1 + i);
            }
        }
    }
}
