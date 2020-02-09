//정올 1523
package testProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("test.txt"));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		if ((N <= 100) && M == 1) {
			for (int j = 0; j < N; j++) {
				for (int i = 0; i < j + 1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if ((N <= 100) && M == 2) {
			for (int j = 0; j < N; j++) {
				for (int i = 0; i < N - j; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if ((N <= 100) && M == 3) {
			for (int j = 0; j < N; j++) {
				for (int i = j; i < N - 1; i++) {
					System.out.print(" ");
				}
				for (int i = 0; i < j * 2 + 1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		if (N > 100 || M < 1 || M > 3)
			System.out.println("INPUT ERROR!");

	}
}