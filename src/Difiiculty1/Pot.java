package Difiiculty1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int antal = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < antal; i++) {
            int changeInt = scanner.nextInt();
            int power = changeInt % 10;
            changeInt/=10;
            int calcNum = (int) Math.pow(changeInt, power);
            sum = sum + calcNum;
        }

        System.out.println(sum);
    }
}
