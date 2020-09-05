package Difiiculty1;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int iter = 0;
        int points = 4;
        while (iter < N) {
            iter++;
            points = (int) Math.pow((((int) Math.pow(2,iter))+1),2);
        }
        System.out.println(points);
    }
}
