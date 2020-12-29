package Problem118A;

import java.util.Scanner;

public class Main { 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char v = str.charAt(i);
			if (isVowel(v))
				continue;
			else if (Character.isUpperCase(str.charAt(i)))
				stringBuilder.append(".").append(Character.toLowerCase(str.charAt(i)));
			else
				stringBuilder.append(".").append(str.charAt(i));

		}
		System.out.println(stringBuilder.toString());

	}

	public static boolean isVowel(char v) {
		String s = "AOYEUIaoyeui";
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == v)
				return true;

		return false;
	}
}
