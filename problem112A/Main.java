package problem112A;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n = s1.compareToIgnoreCase(s2);
		if (n > 0) {
			System.out.println(1);
		} else if (n < 0) {
			System.out.println(-1);
		} else {
			System.out.println(0);
		}

	}

}
