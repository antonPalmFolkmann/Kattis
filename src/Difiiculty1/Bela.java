package Difiiculty1;

import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String suit = scanner.next();
        int sum = 0;

        for (int i = 0; i < 4*N; i++){
            String card = scanner.next();
            String first = card.substring(0,1);
            String last = card.substring(1);
            switch (first) {
                case "A":
                    sum = sum + 11;
                    break;
                case "K":
                    sum = sum + 4;
                    break;
                case "Q":
                    sum = sum + 3;
                    break;
                case "J":
                    if (last.equals(suit)) {
                        sum = sum + 20;
                    } else {
                        sum = sum + 2;
                    }
                    break;
                case "T":
                    sum = sum + 10;
                    break;
                case "9":
                    if (last.equals(suit)) {
                        sum = sum + 14;
                    } else {
                        sum = sum;
                    }
                    break;
                default:
                    sum = sum;
                    break;
            }

        }
        System.out.println(sum);
    }
}
