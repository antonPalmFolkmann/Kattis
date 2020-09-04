import java.util.Scanner;

public class Quality_Adjusted_Life_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp1;
        double temp2;
        double currentQALY = 0;
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){
            temp1 = scanner.nextDouble();
            temp2 = scanner.nextDouble();

            currentQALY = currentQALY + temp1*temp2;
        }
        System.out.println(currentQALY);
    }
}
