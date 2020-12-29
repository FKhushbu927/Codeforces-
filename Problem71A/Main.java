package Problem71A;
//Java solution for codeforces problem 71A. "Way too long words"
//the program takes input of a series of words
//if the word is "too long" it outputs the first and last letter with
//the number of missing characters in between them.
//otherwise it outputs just the word itself
//
import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			String str = sc.nextLine();
			int l = str.length();
			if (l > 10) {
				sb.append(str.charAt(0)).append(l - 2).append(str.charAt(l - 1)).append("\n");
			} else
				sb.append(str).append("\n");

		}

		System.out.println(sb.toString());
	}

}
