package Difiiculty1;

import java.util.Scanner;

public class License_to_Launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nDays = scanner.nextInt();
        int lowestIndex = 0;
        int lowestValue = -1;
        for (int i = 0; i < nDays; i++) {
            int value = scanner.nextInt();
            if (lowestValue == -1){
                lowestValue = value;
            } else if (value < lowestValue){
                lowestValue = value;
                lowestIndex = i;
            }
        }
        System.out.println(lowestIndex);

    }
}
