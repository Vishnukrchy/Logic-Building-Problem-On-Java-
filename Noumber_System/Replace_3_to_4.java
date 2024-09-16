package Noumber_System;

import java.util.Scanner;

public class Replace_3_to_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No ");
		int n = sc.nextInt();
		System.out.println(" New No Is " + replace(n));

	}

	public static int replace(int n) {
		if (n ==3) {
			System.out.println(" The Resultant Noumber Is :5 ");
			return 3;
		} else {
			int result = 0;
			int tenMultples = 1;
			while (n > 0) {
				int rem = n % 10;
				if (rem == 3) {
					result = tenMultples * 4 + result;

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
