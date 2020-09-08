package Difiiculty1;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int v = scanner.nextInt();

        double rad = Math.toRadians(v);
        int result =(int) Math.ceil(h/Math.sin(rad));
        System.out.println(result);
    }
}
