//정올 1719
package testProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("test.txt"));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		if ((N % 2 == 1) && (N <= 100) && M == 1) {
			for (int j = 0; j < N / 2; j++) {
				for (int i = 0; i < j + 1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int j = N / 2; j < N; j++) {
				for (int i = 0; i < N - j; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if ((N % 2 == 1) && (N <= 100) && M == 2) {
			for (int j = 0; j < N / 2; j++) {

				for (int i = j; i < N / 2; i++) {
					System.out.print(" ");
				}
				for (int i = 0; i < j + 1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int j = N / 2; j < N; j++) {
				for (int i = 0; i < j - N / 2; i++) {
					System.out.print(" ");
				}
				for (int i = 0; i < N - j; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if ((N % 2 == 1) && (N <= 100) && M == 3) {
			for (int j = 0; j < N/2; j++) {
				for (int i = 0; i < j; i++) {
					System.out.print(" ");
				}
				for (int i = j*2; i < N; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int j = 0; j <= N/2; j++) {
				for (int i = j+1; i <= N/2; i++) {
					System.out.print(" ");
				}
				for (int i = j; i < j*3+1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if ((N % 2 == 1) && (N <= 100) && M == 4) {
			for (int j = 0; j < N/2; j++) {
				for (int i = 0; i < j; i++) {
					System.out.print(" ");
				}
				for (int i = j; i <= N/2; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int j = 0; j <= N/2; j++) {
				for (int i = 0; i < N/2; i++) {
					System.out.print(" ");
				}
				for (int i = j; i < j*2+1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if (N > 100 || M < 1 || M > 4 || N % 2 == 0)
			System.out.println("INPUT ERROR!");

	}
}