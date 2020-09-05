package Difiiculty1;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        if (minutes - 45 < 0) {
            minutes = minutes + 15;
            if (hours == 0) {
                hours = 23;
            } else {
                hours = hours - 1;
            }
        } else {
            minutes = minutes - 45;
        }
        System.out.println(hours + " " + minutes);
    }
}
