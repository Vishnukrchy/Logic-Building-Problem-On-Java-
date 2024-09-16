package Noumber_System;

import java.util.Scanner;

public class HappyNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No ");
		int n=sc.nextInt();
		if (isHappy(n)) {
			System.out.println(n+" Happy No !!");
		} else {
			System.out.println(" Bekar h Bhaiya mai tut gya ");
		}

	}

	public static boolean isHappy(int n) {
		// in 1--9 Only 7 is happyNo

		while (n > 9) {
			int sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem * rem;
				n = n / 10;
			}
			n = sum;

		}

		return n == 1 || n == 7;

	}
}
