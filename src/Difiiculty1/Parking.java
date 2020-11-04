package Difiiculty1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int nShops = scanner.nextInt();
            int distance = 0;
            ArrayList<Integer> shopList = new ArrayList<>();
            for (int j = 0; j < nShops; j++) {
                int shop = scanner.nextInt();
                shopList.add(shop);
            }
            Collections.sort(shopList);
            for (int j = 0; j < nShops - 1; j++) {
                distance += shopList.get(j+1) - shopList.get(j);
            }
            System.out.println(distance*2);
        }
    }
}
