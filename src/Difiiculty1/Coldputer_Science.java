package Difiiculty1;

import java.util.Scanner;

public class Coldputer_Science {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            int nextNumber = scanner.nextInt();
            if (nextNumber < 0){
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    }
}
