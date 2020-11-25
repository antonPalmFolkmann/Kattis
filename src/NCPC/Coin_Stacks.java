package NCPC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coin_Stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nStacks = scanner.nextInt();
        ArrayList<Integer> stackArray = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nStacks; i++) {
            int num = scanner.nextInt();
            stackArray.add(num);
            sum += num;
        }
        if (sum % 2 != 0){
            System.out.println("no");
        } else {
            for (int i = 0; i < stackArray.size(); i++) {
                int min = Collections.min(stackArray);
                int max = Collections.max(stackArray);

            }




        }
    }
}
