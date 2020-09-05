package Difiiculty1;

import java.util.Scanner;

public class Nasty_Hacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int r = scanner.nextInt();
            int e = scanner.nextInt();
            int c = scanner.nextInt();

            if (e - c > r){
                System.out.println("advertise");
            } else if (e - c == r){
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}
