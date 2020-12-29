package Problem1462A;
//1462A - A. Favorite Sequence

//https://codeforces.com/problemset/problem/1462/A
//Fatema Khushbu

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcase = s.nextInt();
		while (testcase > 0) {
			int length = s.nextInt();
			int[] myArray = new int[length];
			for (int i = 0; i < length; i++) {
				myArray[i] = s.nextInt();
			}
			int i = 0;
			for (i = 0; i < length / 2; i++) {
				System.out.print(myArray[i] + " ");
				System.out.print(myArray[length - 1 - i] + " ");
			}
			if (length % 2 == 1) {
				System.out.print(myArray[i] + " ");
			}
			System.out.println(" ");
			testcase--;
		}
	}
}
