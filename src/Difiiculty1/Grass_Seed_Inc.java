package Difiiculty1;

import java.util.Scanner;

public class Grass_Seed_Inc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cost = scanner.nextDouble();
        int numOfLawns = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < numOfLawns; i++){
            double w = scanner.nextDouble();
            double h = scanner.nextDouble();

            sum = sum + w*h*cost;
        }
        System.out.println(sum);
    }
}
