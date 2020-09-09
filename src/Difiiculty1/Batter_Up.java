package Difiiculty1;

import java.util.Scanner;

public class Batter_Up {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double denom = n;
        int sum = 0;

        for (int i = 0; i < n; i++){
            int next = scanner.nextInt();
            if (next < 0){
                denom -= 1;
            } else {
                sum += next;
            }
        }
        double avBat = sum/denom;
        System.out.println(avBat);;
    }
}
