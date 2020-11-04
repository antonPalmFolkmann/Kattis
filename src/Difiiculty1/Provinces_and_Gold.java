package Difiiculty1;

import java.util.Scanner;

public class Provinces_and_Gold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numGold = scanner.nextInt();
        int numSilv = scanner.nextInt();
        int numCopp = scanner.nextInt();
        int buyingPower = numGold*3 + numSilv*2 + numCopp;
        if (buyingPower > 7){
            System.out.print("Province or ");
        } else if (buyingPower > 4){
            System.out.print("Duchy or ");
        } else if (buyingPower > 1){
            System.out.print("Estate or ");
        }

        if (buyingPower > 5){
            System.out.println("Gold");
        } else if (buyingPower > 2){
            System.out.println("Silver");
        } else {
            System.out.println("Copper");
        }
    }
}
