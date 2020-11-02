package Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CandyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nCandies = scanner.nextLong();
        long squareRoot = (long) Math.sqrt(nCandies) + 1;
        ArrayList<Long> array = new ArrayList<>();

        for (long i = 1; i < squareRoot; i++) {
            long inverse = (long) (nCandies/i) -1;
            if (nCandies % i == 0 && !array.contains(i-1)){
                array.add(i-1);
                if (inverse > 0 && i*i != nCandies && !array.contains(inverse))
                array.add(inverse);
            }
        }

        Collections.sort(array);
        for (long counter : array){
            System.out.print(counter + " ");
        }
    }
}
