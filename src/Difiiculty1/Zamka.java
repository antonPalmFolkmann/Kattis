package Difiiculty1;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int D = scanner.nextInt();
        int X = scanner.nextInt();
        int N = L;
        int M = D;

        while (calcSum(N) != X){
            N++;
        }
        System.out.println(N);
        while (calcSum(M) != X){
            M--;
        }
        System.out.println(M);
    }

    public static int calcSum(int m){
        int n = 0;
        int sum = 0;
        while(m > 0){
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        return sum;
    }
}
