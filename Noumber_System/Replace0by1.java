package Noumber_System;

import java.util.Scanner;

// WAJP TO TAKE A INTEGER INPUT AND REPLACE ALL '0' BY '1'
// IP -: 41022005
// O/P -:41122115
public class Replace0by1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No ");
		int n = sc.nextInt();
		System.out.println(" New No Is " + replace(n));

	}

	public static int replace(int n) {
		if (n == 0) {
			return 1;
		} else {
			int result = 0;
			int tenMultples = 1;
			while (n > 0) {
				int rem = n % 10;
				if (rem == 0) {
					result = tenMultples * 1 + result;

				} else {
					result = tenMultples * rem + result;
				}
				tenMultples = tenMultples * 10;

				n = n / 10;
			}
			return result;
		}
	}
}
