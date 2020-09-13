package Difiiculty1;

import java.util.Scanner;

public class Transit_Woes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;
        int[] d = new int[n+1];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i <= n; i++)
        {d[i] = scanner.nextInt();}

        for (int i = 0; i < n; i++)
        {b[i] = scanner.nextInt();}

        for (int i = 0; i < n; i++)
        {c[i] = scanner.nextInt();}

        count += d[0];
        for (int i = 0; i < n; i++){
            int remainder = count % c[i];
            if (remainder == 0){
                remainder = c[i];
            }
            count += c[i] - remainder;
            count += b[i] + d[i+1];
        }
        if (count <= t){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
