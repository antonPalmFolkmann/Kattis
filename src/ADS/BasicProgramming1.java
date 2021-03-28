package ADS;

import java.util.*;


public class BasicProgramming1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		switch(t){
		case 1:
			System.out.println(7);
			break;
		case 2:
			if (A[0] > A[1]){
				System.out.println("Bigger");
			} else if (A[0] == A[1]) {
				System.out.println("Equal");
			} else {
				System.out.println("Smaller");
			}
			break;
		case 3:
			int[] B = {A[0],A[1],A[2]};
			Arrays.sort(B);
			System.out.println(A[1]);
			break;
		case 4:
			int sum = 0;
			for (int i = 0; i < N; i++){
				sum += A[i];
			}
			System.out.println(sum);
			break;
		case 5:
			int sum1 = 0;
			for (int i = 0; i < N; i++){
				if (A[i] % 2 == 0) {
					sum1 += A[i];
				}
			}
			System.out.println(sum1);
			break;
		case 6:
			char[] B1 = new char[N];
			for (int i = 0; i < N; i++){

				B1[i] = getChar(A[i] % 26);
			}
			for (int i = 0; i < N; i++){
				System.out.print(B1[i]);
			}
			System.out.println();
			break;
		case 7:
			int i = 0;
			int ok = 0;
			HashSet<Integer> set = new HashSet<>();
			while (ok == 0){
				i = A[i];
				if (i < 0 || i > N-1) {
					System.out.println("Out");
					break;
				} else if (i == N-1) {
					System.out.println("Done");
					break;
				} else {
					if (set.contains(i)){
						System.out.println("Cyclic");
						break;
					} else {
						set.add(i);
					}
				}
			}
		}
	}


	public static char getChar(int c){
		char result = (char) (c + 97);
		return result;
	}
}
