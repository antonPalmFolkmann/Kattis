package Difiiculty1;

import java.util.HashMap;
import java.util.Scanner;

public class Ive_Been_Everywhere_Man {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCases = scanner.nextInt();
        for (int i = 0; i < nCases; i++) {
            int nCities = scanner.nextInt();
            HashMap<String,Integer> cities = new HashMap<String,Integer>(nCities);
            for (int j = 0; j < nCities; j++) {
                int key = 1;
                String city = scanner.next();
                cities.put(city,key);
            }
            System.out.println(cities.size());
            cities.clear();
        }
    }
}
