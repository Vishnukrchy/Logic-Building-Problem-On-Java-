package Noumber_System;

import java.util.Scanner;

public class Replace_7_0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No ");
		int n = sc.nextInt();
		System.out.println(" New No Is " + replace(n));

	}

	public static int replace(int n) {
		if (n == 7) {
			System.out.println(" The Resultant Noumber Is :7 ");
			return 5;
		} else {
			int result = 0;
			int tenMultples = 1;
			while (n > 0) {
				int rem = n % 10;
				if (rem == 7) {
					result = tenMultples * 0 + result;

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
