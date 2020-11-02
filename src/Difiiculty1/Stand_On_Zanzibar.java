package Difiiculty1;

import java.util.Scanner;

public class Stand_On_Zanzibar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            int lowerBound = 0;
            int[] numArray = new int[inputArray.length];
            for (int j = 0; j < inputArray.length; j++) {
                numArray[j] = Integer.parseInt(inputArray[j]);
            }
            for (int j = 0; j < numArray.length - 1; j++) {
                if (numArray[j+1] > numArray[j]*2)
                lowerBound += numArray[j+1] - numArray[j]*2;
            }
            System.out.println(lowerBound);
        }
    }
}
