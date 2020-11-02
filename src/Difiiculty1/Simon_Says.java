package Difiiculty1;

import java.util.Scanner;

public class Simon_Says {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String sentence = scanner.nextLine();
            if (sentence.contains("Simon says")){
                System.out.println(sentence.substring(11));
            }
        }
    }
}
