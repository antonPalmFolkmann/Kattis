package Difiiculty1;

import java.util.Scanner;

public class No_Duplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int count = 0;
        for (String word : inputArray) {
            for (String s : inputArray) {
                if (word.equals(s)) {
                    count++;
                }
            }
        }
        if (count > inputArray.length){
            System.out.println("no");
        } else {
            System.out.println("yes");
        }


    }
}
