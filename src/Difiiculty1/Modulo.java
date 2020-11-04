package Difiiculty1;

import java.util.HashMap;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nValues = 10;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nValues; i++) {
            int number = scanner.nextInt();
            int mod = number % 42;
            map.put(mod,mod);
        }
        System.out.println(map.size());
    }
}
