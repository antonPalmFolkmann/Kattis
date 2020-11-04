package Difiiculty1;

import java.util.Arrays;
import java.util.Scanner;

public class Poker_Hand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 5; i++) {
            String hand = scanner.next();
            String firstLetter = hand.substring(0,1);
            switch (firstLetter){
                case "A":
                    array[0]++;
                    break;
                case "2":
                    array[1]++;
                    break;
                case "3":
                    array[2]++;
                    break;
                case "4":
                    array[3]++;
                    break;
                case "5":
                    array[4]++;
                    break;
                case "6":
                    array[5]++;
                    break;
                case "7":
                    array[6]++;
                    break;
                case "8":
                    array[7]++;
                    break;
                case "9":
                    array[8]++;
                    break;
                case "T":
                    array[9]++;
                    break;
                case "J":
                    array[10]++;
                    break;
                case "Q":
                    array[11]++;
                    break;
                case "K":
                    array[12]++;
                    break;
            }
        }
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }
}
