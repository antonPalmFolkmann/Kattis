package Difficulty2;

import java.util.Arrays;
import java.util.Scanner;

public class Sticky_Situation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextLong();
        }
        int j = 0;
        Arrays.sort(array);
        while (j <= n - 2){
            if (j == n - 2){System.out.println("impossible"); break;}
            long a = array[j];
            long b = array[j+1];
            long c = array[j+2];
            if (isPossibleTriangle(a,b,c)){
                System.out.println("possible");
                break;
            } else {
                j++;
            }
        }
    }

    public static boolean isPossibleTriangle(long a, long b, long c){
        return a + b > c && b + c > a && a + c > b;
    }


}
