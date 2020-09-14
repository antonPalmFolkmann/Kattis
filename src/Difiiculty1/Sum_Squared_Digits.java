package Difiiculty1;

import java.math.BigInteger;
import java.util.Scanner;

public class Sum_Squared_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nSet = scanner.nextInt();
        for (int i = 0; i < nSet; i++){
            int setNr = scanner.nextInt();
            int base = scanner.nextInt();
            int value = scanner.nextInt();
            int SSD = 0;
            while (value > 0){
                int rem = value % base;
                SSD = (int) (SSD + Math.pow(rem,2));
                value = value / base;
            }
            String newValue = convert(SSD,10);
            System.out.println(setNr + " " + newValue);
        }

    }

    public static String convert(int number, int base)
    {
        int quotient = number / base;
        int remainder = number % base;

        if (quotient == 0) // base case
        {
            return Integer.toString(remainder);
        }
        else
        {
            return convert(quotient, base) + Integer.toString(remainder);
        }
    }
}
