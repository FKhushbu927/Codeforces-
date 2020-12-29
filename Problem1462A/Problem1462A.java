package Problem1462A;
//1462A - A. Favorite Sequence
//https://codeforces.com/problemset/problem/1462/A
//Fatema Khushbu
import java.util.Scanner;
public class Problem1462A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcase = s.nextInt();
		while (testcase > 0) {
			int length = s.nextInt();
			int a[] = new int[length];
			for (int i = 0; i < length; i++) {
				a[i] = s.nextInt();
			}

			for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
				System.out.print(a[i] + " ");
				System.out.print(a[j] + " ");
			}
			if (length % 2 == 1) {
				System.out.print(a[length / 2] + " ");
			}
			System.out.println(" ");

			testcase--;
		}
	}

}
