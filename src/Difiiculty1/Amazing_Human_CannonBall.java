package Difiiculty1;

import java.util.Scanner;

public class Amazing_Human_CannonBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float g = (float) 9.81;
        for (int i = 0; i < n; i++){
            float v0 = scanner.nextFloat();
            float theta = scanner.nextFloat();
            theta = (float) Math.toRadians(theta);
            float x1 = scanner.nextFloat();
            float h1 = scanner.nextFloat();
            float h2 = scanner.nextFloat();

            float t = (float) (x1/(v0*Math.cos(theta)));
            float y = (float) ((float) (v0*t*Math.sin(theta))-(0.5*g*Math.pow(t,2)));

            if ((y + 1) <= h2 && (y - 1) >= h1){
                System.out.println("Safe");
            } else {
                System.out.println("Not safe");
            }
        }
    }
}
