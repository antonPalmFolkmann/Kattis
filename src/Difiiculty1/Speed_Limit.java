package Difiiculty1;

import java.util.Scanner;

public class Speed_Limit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = scanner.nextInt();
        while (nLines > 0){
            int timeSum = 0;
            int milesCount = 0;
            for (int i = 0; i < nLines; i++){
                int speed = scanner.nextInt();
                int time = scanner.nextInt();
                milesCount = milesCount + speed*(time-timeSum);
                timeSum = time;
            }
            System.out.println(milesCount + " miles");
            nLines = scanner.nextInt();
        }
    }
}
