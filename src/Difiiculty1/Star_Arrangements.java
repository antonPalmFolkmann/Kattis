package Difiiculty1;

import java.util.Scanner;

public class Star_Arrangements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nStars = scanner.nextInt();
        int x = 2;
        int y = 1;
        System.out.println(nStars + ":");
        while (y < nStars/2 + 1){
            int result = flagTester(x,y, nStars);
            if (result == 1){
                System.out.println(x + "," + y);
            }
            if (x == y){
                x++;
            } else {
                y++;
            }
        }
    }
    public static int flagTester(int x, int y, int stars){
        int sum = x + y;
        if (stars % sum == 0 || stars % sum == x){
            return 1;
        } else {
            return 0;
        }
    }
}
