package Difiiculty1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            if ((i+1) % x == 0 && (i+1) % y == 0){
                System.out.println("FizzBuzz");
            } else if ((i+1) % x == 0){
                System.out.println("Fizz");
            } else if ((i+1) % y == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i+1);
            }
        }
    }
}
